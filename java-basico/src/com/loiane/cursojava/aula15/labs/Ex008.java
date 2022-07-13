package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        8. Faça um Programa que pergunte o preço de três produtos e informe
 *        qual produto você deve comprar, sabendo que a decisão é sempre pelo
 *        mais barato.
 */

public class Ex008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double[] precos = new double[3];

		System.out.println("VERIFICAÇÃO DE PREÇOS");

		for (int i = 0; i <= 2; i++) {
			System.out.printf("Digite o valor do %dº produto: ", (i + 1));
			precos[i] = scan.nextDouble();
		}

		if (precos[0] < precos[1] && precos[0] < precos[2]) {
			System.out.println("Você deve comprar o 1º produto.");
		} else if (precos[1] < precos[0] && precos[1] < precos[2]) {
			System.out.println("Você deve comprar o 2º produto.");
		} else {
			System.out.println("Você deve comprar o 3º produto.");
		}

		scan.close();

	}

}
