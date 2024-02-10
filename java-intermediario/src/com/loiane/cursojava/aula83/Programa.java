package com.loiane.cursojava.aula83;

public class Programa {
	public static void main(String[] args) {

		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra; // problemas de performance
		}

		System.out.println(alfabeto);

		// StringBuffer e thread-safe
		StringBuffer stringBuffer = new StringBuffer();
		for (String letra : letras) {
			stringBuffer.append(letra); // adiciona na colecao de strings
		}
		alfabeto = stringBuffer.toString();

		System.out.println(alfabeto);

		alfabeto = new String(stringBuffer);
		System.out.println(alfabeto);

		// Metodo reverse
		System.out.println(stringBuffer.reverse());

		// StringBuilder nao e thread-safe, mas realiza o mesmo procedimento que o StringBUffer
		StringBuilder stringBuilder = new StringBuilder();
		for (String letra : letras) {
			stringBuilder.append(letra);
		}
		alfabeto = stringBuilder.toString();

		System.out.println(alfabeto);
	}
}
