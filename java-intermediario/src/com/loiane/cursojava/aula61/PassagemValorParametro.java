package com.loiane.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;

		System.out.println("Valores originais");

		System.out.println(contato);
		System.out.println(valor);

		System.out.println("Exemplo 1: o valor de contato não modifica");

		testePassagemValorReferencia(valor, contato);

		System.out.println(contato);
		System.out.println(valor);

		System.out.println("Exemplo 2: o valor de Contato modifica através do método set");

		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
	}

	// Tipos primitivos - passagem por valor
	// Tipos classe, enum, array - passagem por referencia (dentro do metodo vai ser
	// feito uma copia da ref no objeto)

	// Criacao de uma copia do endereco de memoria no metodo e,
	// ao modificar, as instancias foram modificadads localmente,
	// ou seja, cria-se um novo endereco de memoria com os mesmos valores
	private static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}

	// Criacao de uma copia do endereco de memoria no metodo e,
	// ao modificar, as instancias foram modificadads globalmente
	// atraves do metodo set, onde a copia tem o mesmo endereco de memoria

	private static void testePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato" + novoValor);
	}
}