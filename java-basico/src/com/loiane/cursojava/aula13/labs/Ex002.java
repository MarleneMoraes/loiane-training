package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 *        2. Faça um Programa que peça um número e então mostre a mensagem O
 *        número informado foi [número].
 */

public class Ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		System.out.printf("O número informado foi %d", numero);

		scan.close();
	}

}
