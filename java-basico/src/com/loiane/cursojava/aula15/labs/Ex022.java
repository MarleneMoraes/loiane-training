package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-09
 * 
 *        22. Faça um Programa que peça um número inteiro e determine se ele é
 *        par ou ímpar. Dica: utilize o operador módulo (resto da divisão).
 */

public class Ex022 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("PAR OU ÍMPAR");
		System.out.print("Digite um número: ");
		int valor = scan.nextInt();

		if (valor % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		scan.close();
	}

}
