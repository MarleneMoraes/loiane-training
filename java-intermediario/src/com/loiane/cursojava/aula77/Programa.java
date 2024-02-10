package com.loiane.cursojava.aula77;

import java.util.Arrays;

public class Programa {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String java = "Java";

		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0); // o 3 e nao-inclusivo
		System.err.println(jav); // impressao de erro (na IDE mostra em vermelho)

		// seria o mesmo que
		for (int i = 0, j = 0; i < 3; i++, j++) {
			jav[j] = java.charAt(i);
		}
		System.out.println(jav);

		byte[] javBytes = new byte[3];
		java.getBytes(0, 3, javBytes, 0); // busca os caracteres na tabela ASCII
		System.out.println(Arrays.toString(javBytes));

		char[] javaChars = java.toCharArray(); // transformacao da String para caractere
		System.out.println(javaChars);
	}
}
