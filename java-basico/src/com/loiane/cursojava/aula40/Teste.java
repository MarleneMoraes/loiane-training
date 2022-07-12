package com.loiane.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluna = new Aluno();
		Pessoa professora = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluna.setEndereco("Rua 2, num 2");
		professora.setEndereco("Rua 3, num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluna.obterEtiquetaEndereco());
		System.out.println(professora.obterEtiquetaEndereco());

	}

}
