package com.loiane.cursojava.aula63;

public class ExemploPrintf {
	public static void main(String[] args) {
		// printf tem como parametros a formatacao e o varargs correspondente

		// Outputs
		// Strings
		System.out.printf("%s", "Olá, Mundo!");
		System.out.println(); // pular de linha
		System.out.printf("%S", "Olá, Mundo!"); // %S passa o texto em caixa alta
		System.out.println();

		// Caracteres
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');

		System.out.printf("%n"); // boa pratica ao utilizar o printf e utilizar %n

		// Numeros inteiros
		int valor = 123456789;
		System.out.printf("%d", valor);

		System.out.println();

		// Ponto flutuante
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);

		System.out.println();

		// Limitacao de caracteres - por padrao a direita
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);

		System.out.println();

		// Limitacao de caracteres - por padrao a esqueda
		System.out.printf("%-20s", olaMundo);

		System.out.println();

		// impressao do +
		System.out.printf("%+d", valor);

		System.out.println();

		// formatacao de numeros com quatidade de digitos solicitada - o Java completara
		// com zeros
		System.out.printf("%015d", valor);

		System.out.println();

		System.out.printf("%,d", valor); // para pt-br, usa .

		System.out.println();

		int valor2 = -123456789;
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor); // caso positivo, imprime um espaco referente a formatacao

		System.out.println();

		// arredonda com tres casas decimais
		System.out.printf("%.3f", pontoFlutuante);

		System.out.println();

		// espacamento de digitos solicitado + o arredondamento de casas decimais apos o ponto
		System.out.printf("R$%10.2f", pontoFlutuante);

		System.out.println();

		notaFiscal();
	}

	private static void notaFiscal() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}
	}

}