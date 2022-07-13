package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 *        3. Faça um Programa que peça dois números e imprima a soma.
 */

public class Ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2, soma;

		System.out.println("SOMA DE NÚMEROS");

		System.out.print("Digite o primeiro valor: ");
		numero1 = scan.nextInt();

		System.out.print("Digite o segundo valor: ");
		numero2 = scan.nextInt();

		soma = numero1 + numero2;

		System.out.printf("Soma: %d", soma);

		scan.close();
	}

}
