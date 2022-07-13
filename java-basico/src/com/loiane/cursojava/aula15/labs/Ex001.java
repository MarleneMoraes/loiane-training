package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
 */

public class Ex001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("MAIOR E MENOR");

		System.out.print("Digite um valor: ");
		double numero1 = scan.nextDouble();

		System.out.print("Digite outro valor: ");
		double numero2 = scan.nextDouble();

		if (numero1 > numero2) {
			System.out.printf("O n�mero %.1f � maior.", numero1);
		} else {
			System.out.printf("O n�mero %.1f � maior.", numero2);
		}

		scan.close();

	}

}
