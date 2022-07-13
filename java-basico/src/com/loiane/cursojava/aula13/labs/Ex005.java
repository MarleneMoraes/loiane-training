package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 *        5. Faça um Programa que converta metros para centímetros.
 */

public class Ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		System.out.println("CONVERSOR DE METROS EM CENTÍMETRO");

		System.out.print("Digite o valor em metros: ");
		valor = scan.nextDouble();

		valor *= 100;

		System.out.printf("Valor em centímetro: %.2fcm", valor);
		scan.close();
	}

}
