package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        8. Fa�a um Programa que pergunte o pre�o de tr�s produtos e informe
 *        qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo
 *        mais barato.
 */

public class Ex008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double[] precos = new double[3];

		System.out.println("VERIFICA��O DE PRE�OS");

		for (int i = 0; i <= 2; i++) {
			System.out.printf("Digite o valor do %d� produto: ", (i + 1));
			precos[i] = scan.nextDouble();
		}

		if (precos[0] < precos[1] && precos[0] < precos[2]) {
			System.out.println("Voc� deve comprar o 1� produto.");
		} else if (precos[1] < precos[0] && precos[1] < precos[2]) {
			System.out.println("Voc� deve comprar o 2� produto.");
		} else {
			System.out.println("Voc� deve comprar o 3� produto.");
		}

		scan.close();

	}

}
