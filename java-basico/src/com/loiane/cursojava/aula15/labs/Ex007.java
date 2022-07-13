package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        7. Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor
 *        deles.
 */

public class Ex007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double[] numeros = new double[3];

		System.out.println("O MAIOR E O MENOR DOS N�MEROS");

		for (int i = 0; i <= 2; i++) {
			System.out.print("Digite um valor: ");
			numeros[i] = scan.nextDouble();
		}

		if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {

			if (numeros[1] < numeros[2]) {
				System.out.printf("O n�mero %.1f � menor.\n", numeros[1]);
			} else {
				System.out.printf("O n�mero %.1f � menor.\n", numeros[2]);
			}

			System.out.printf("O n�mero %.1f � maior.\n", numeros[0]);
		} else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {

			if (numeros[0] < numeros[2]) {
				System.out.printf("O n�mero %.1f � menor.\n", numeros[0]);
			} else {
				System.out.printf("O n�mero %.1f � menor.\n", numeros[2]);
			}

			System.out.printf("O n�mero %.1f � maior.\n", numeros[1]);
		} else {

			if (numeros[0] < numeros[1]) {
				System.out.printf("O n�mero %.1f � menor.\n", numeros[0]);
			} else {
				System.out.printf("O n�mero %.1f � menor.\n", numeros[1]);
			}

			System.out.printf("O n�mero %.1f � maior.\n", numeros[2]);
		}

		scan.close();

	}

}
