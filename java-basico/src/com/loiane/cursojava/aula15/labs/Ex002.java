package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        2. Fa�a um Programa que pe�a um n�mero e mostre na tela se o valor �
 *        positivo ou negativo.
 */

public class Ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("POSITIVO E NEGATIVO");

		System.out.print("Digite um valor: ");
		double numero = scan.nextDouble();

		if (numero > 0) {
			System.out.printf("O n�mero %.1f � positivo.", numero);
		} else {
			System.out.printf("O n�mero %.1f � negativo.", numero);
		}

		scan.close();

	}

}
