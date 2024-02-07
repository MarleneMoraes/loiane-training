package com.loiane.cursojava.aula62;

public class ExemploVarargs {
	public static void main(String[] args) {
		// Varargs - recurso da linguagem Java no qual passa infinitos parametros
		// sem a declaracao de todos os parametros - a partir do Java 5

		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));

		int[] vetor = { 1, 2, 3, 4, 5 };
		System.out.println(soma(vetor));

		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // utilizacao do varargs
	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	static int soma(int[] vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}

	// static int soma(Integer... vetor, int a, int b) { // ERRO DE COMPILACAO: o Java nao consegue compilar pois nao sabe o limite do varargs
	static int soma(int a, int b, Integer... vetor) { // Java interpreta os dois primeiros numeros (a, b) e os demais como varargs (Integer... )

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}

}