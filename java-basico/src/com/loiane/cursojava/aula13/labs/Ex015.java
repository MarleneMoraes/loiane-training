package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        15. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
 *        n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
 *        sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
 *        Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
 *        programa que nos d�: 
 *        a. sal�rio bruto 
 *        b. quanto pagou ao INSS 
 *        c. quanto pagou ao sindicato 
 *        d. o sal�rio l�quido 
 *        e. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
 * 
 *        + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%)
 *        : R$ = Sal�rio Liquido : R$
 * 
 *        Obs: Sal�rio Bruto - Descontos = Sal�rio L�quido.
 */

public class Ex015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioBruto, salarioLiquido, valorPorHora, impostoDeRenda, inss, sindicato;

		System.out.println("SAL�RIO DO M�S");

		System.out.print("Digite o valor que ganha por hora: ");
		valorPorHora = scan.nextDouble();

		System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
		horasTrabalhadas = scan.nextInt();

		// sal�rio bruto
		salarioBruto = valorPorHora * horasTrabalhadas;

		// quanto pagou ao INSS
		inss = salarioBruto * 0.08;

		// quanto pagou ao sindicato
		sindicato = salarioBruto * 0.05;

		// o sal�rio l�quido
		impostoDeRenda = salarioBruto * 0.11;

		salarioLiquido = salarioBruto - (inss + sindicato + impostoDeRenda);

		System.out.printf("Sal�rio Bruto: R$%.2f", salarioBruto);
		System.out.printf("INSS: R$%.2f", inss);
		System.out.printf("Sindicato: R$%.2f", sindicato);
		System.out.printf("Sal�rio l�quido: R$%.2f", salarioLiquido);

		scan.close();
	}

}