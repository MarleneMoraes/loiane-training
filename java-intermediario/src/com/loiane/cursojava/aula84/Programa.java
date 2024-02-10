package com.loiane.cursojava.aula84;

import java.util.StringTokenizer;

public class Programa {
	public static void main(String[] args) {

		String doArquivo = "1;Antônio;30;";

		StringTokenizer tokenizer = new StringTokenizer(doArquivo, ";");

		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

	}

}
