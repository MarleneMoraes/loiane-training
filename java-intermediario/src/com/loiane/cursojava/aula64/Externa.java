package com.loiane.cursojava.aula64;

public class Externa {

    // atributos da classe Externa
    private String texto = "texto externo";

    // declaracao da classe Interna
    public class Interna {

        // atributos da classe Interna
        private String texto = "texto interno";

        public void imprimeTexto() {
            System.out.println(texto); // texto interno

            // acessos dos membros da classe Externa
            System.out.println(Externa.this.texto); // texto externo
        }
    }

    public void metodoQualquer(){

        // Classe Local - declaracao de uma classe dentro do escopo local de um metodo
		class ClasseLocal{

			private String texto = "texto classe local";

			public void imprimeTexto(){
				System.out.println(texto); // texto classe local
			}
		}

		ClasseLocal local = new ClasseLocal();

		local.imprimeTexto();
	}

    public static void main(String[] args) {

        Externa externa = new Externa();
        Interna interna = externa.new Interna(); // deve possuir uma instancia da classe Externa para somente depois instanciar a classe Interna

        interna.imprimeTexto();

        externa.metodoQualquer();
    }
}