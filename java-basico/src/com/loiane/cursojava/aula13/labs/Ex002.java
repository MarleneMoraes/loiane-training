package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 *        2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O
 *        n�mero informado foi [n�mero].
 */

public class Ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();
		System.out.printf("O n�mero informado foi %d", numero);

		scan.close();
	}

}
