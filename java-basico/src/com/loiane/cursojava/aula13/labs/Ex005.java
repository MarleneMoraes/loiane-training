package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 *        5. Fa�a um Programa que converta metros para cent�metros.
 */

public class Ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		System.out.println("CONVERSOR DE METROS EM CENT�METRO");

		System.out.print("Digite o valor em metros: ");
		valor = scan.nextDouble();

		valor *= 100;

		System.out.printf("Valor em cent�metro: %.2fcm", valor);
		scan.close();
	}

}
