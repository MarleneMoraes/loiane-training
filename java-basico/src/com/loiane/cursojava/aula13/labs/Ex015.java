package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        15. Faça um Programa que pergunte quanto você ganha por hora e o
 *        número de horas trabalhadas no mês. Calcule e mostre o total do seu
 *        salário no referido mês, sabendo-se que são descontados 11% para o
 *        Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
 *        programa que nos dê: 
 *        a. salário bruto 
 *        b. quanto pagou ao INSS 
 *        c. quanto pagou ao sindicato 
 *        d. o salário líquido 
 *        e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * 
 *        + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%)
 *        : R$ = Salário Liquido : R$
 * 
 *        Obs: Salário Bruto - Descontos = Salário Líquido.
 */

public class Ex015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioBruto, salarioLiquido, valorPorHora, impostoDeRenda, inss, sindicato;

		System.out.println("SALÁRIO DO MÊS");

		System.out.print("Digite o valor que ganha por hora: ");
		valorPorHora = scan.nextDouble();

		System.out.print("Digite o número de horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();

		// salário bruto
		salarioBruto = valorPorHora * horasTrabalhadas;

		// quanto pagou ao INSS
		inss = salarioBruto * 0.08;

		// quanto pagou ao sindicato
		sindicato = salarioBruto * 0.05;

		// o salário líquido
		impostoDeRenda = salarioBruto * 0.11;

		salarioLiquido = salarioBruto - (inss + sindicato + impostoDeRenda);

		System.out.printf("Salário Bruto: R$%.2f", salarioBruto);
		System.out.printf("INSS: R$%.2f", inss);
		System.out.printf("Sindicato: R$%.2f", sindicato);
		System.out.printf("Salário líquido: R$%.2f", salarioLiquido);

		scan.close();
	}

}