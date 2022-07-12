/*
 * Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual 
 * operação ele deseja realizar. O resultado da operação deve ser acompanhado 
 * de uma frase que diga se o número é:
 * 		a. par ou ímpar;
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
		
		System.out.println("OPERAÇÕES MATEMÁTICAS");
		System.out.print("Digite um número: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite um número: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Digite a operação desejada \n(1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão):" );
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
				System.out.println("Opção inválida");
		}
		
		
		if (resultado % 2 == 0) {
			System.out.println("O resultado é par.");
		} else {
			System.out.println("O resultado é ímpar.");
		}
		
		if (resultado < 0) {
			System.out.println("O resultado é negativo.");
		} else {
			System.out.println("O resultado é positivo.");
		}
		
		
		scan.close();

	}

}
