package com.loiane.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa(); //somente as classes filhas podem ser instanciadas, pois a classe Pessoa é abstrata
		Pessoa aluna = new Aluno();
		Pessoa professora = new Professor();
		
		aluna.setEndereco("Rua 2, num 2");
		professora.setEndereco("Rua 3, num 3");
		
		aluna.imprimirEtiquetaEndereco();
		professora.imprimirEtiquetaEndereco();

	}

}
