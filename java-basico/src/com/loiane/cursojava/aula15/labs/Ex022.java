package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-09
 * 
 *        22. Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
 *        par ou �mpar. Dica: utilize o operador m�dulo (resto da divis�o).
 */

public class Ex022 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("PAR OU �MPAR");
		System.out.print("Digite um n�mero: ");
		int valor = scan.nextInt();

		if (valor % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}

		scan.close();
	}

}
