package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        8. Faça um Programa que pergunte quanto você ganha por hora e o número
 *        de horas trabalhadas no mês. Calcule e mostre o total do seu salário
 *        no referido mês.
 */

public class Ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double salario, valorPorHora;

		System.out.println("SALÁRIO DO MÊS");

		System.out.print("Digite o valor que ganha por hora: ");
		valorPorHora = scan.nextDouble();

		System.out.print("Digite o número de horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();

		salario = valorPorHora * horasTrabalhadas;

		System.out.printf("Salário deste mês: R$%.2f", salario);

		scan.close();
	}

}
