/*
 * Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual 
 * opera��o ele deseja realizar. O resultado da opera��o deve ser acompanhado 
 * de uma frase que diga se o n�mero �:
 * 		a. par ou �mpar;
 * 		b. positivo ou negativo.
 */

/**
 * @author Marlene
 * @since 2022-02-07
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("OPERA��ES MATEM�TICAS");
		System.out.print("Digite um n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite um n�mero: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Digite a opera��o desejada \n(1 - Adi��o | 2 - Subtra��o | 3 - Multiplica��o | 4 - Divis�o):" );
		int opcao = scan.nextInt();
		
		double resultado = 0;
		
		switch(opcao) {
			case 1: 
				resultado = num1 + num2;
				break;
			case 2: 
				resultado = num1 - num2;
				break;
			case 3: 
				resultado = num1 * num2;
				break;
			case 4: 
				resultado = num1 / num2;
				break;
			default:
				System.out.println("Op��o inv�lida");
		}
		
		
		if (resultado % 2 == 0) {
			System.out.println("O resultado � par.");
		} else {
			System.out.println("O resultado � �mpar.");
		}
		
		if (resultado < 0) {
			System.out.println("O resultado � negativo.");
		} else {
			System.out.println("O resultado � positivo.");
		}
		
		
		scan.close();

	}

}
