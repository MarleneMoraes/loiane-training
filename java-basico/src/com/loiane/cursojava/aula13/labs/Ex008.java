package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero
 *        de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio
 *        no referido m�s.
 */

public class Ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double salario, valorPorHora;

		System.out.println("SAL�RIO DO M�S");

		System.out.print("Digite o valor que ganha por hora: ");
		valorPorHora = scan.nextDouble();

		System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
		horasTrabalhadas = scan.nextInt();

		salario = valorPorHora * horasTrabalhadas;

		System.out.printf("Sal�rio deste m�s: R$%.2f", salario);

		scan.close();
	}

}
