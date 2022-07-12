/*
 *	As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores 
 *	e lhe contrataram para desenvolver o programa que calcular� os reajustes.
 *	Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte 
 *	crit�rio, baseado no sal�rio atual:
 *		- sal�rios at� R$280,00 (incluindo): aumento de 20%
 *		- sal�rios entre R$280,00 e R$700,00: aumento de 15%
 *		- sal�rios entre R$700,00 e R$1500,00: aumento de 10%
 *		- sal�rios entre R$1500,00 em diante: aumento de 5%
 *	Ap�s o aumento ser realizado, informe na tela:
 *		- o sal�rio antes do reajuste;
 *		- o percentual de aumento aplicado;
 *		- o valor do aumento;
 *		- o novo sal�rio, ap�s o aumento.	   
 * */

/**
 * @author Marlene
 * @since 2022-02-06
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("REAJUSTE SALARIAL");
		
		System.out.print("Sal�rio atual: ");
		double salarioAtual = scan.nextDouble();
		
		double percentual = 0, aumento = 0;
		
		if (salarioAtual <= 280.00) {
			percentual = 20;
			aumento = salarioAtual * 0.2;
					
		} else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {
			percentual = 15;
			aumento = salarioAtual * 0.15;
			
		} else if (salarioAtual > 700.00 && salarioAtual <= 1500) {
			percentual = 10;
			aumento = salarioAtual * 0.1;
		
		} else {
			percentual = 5;
			aumento = salarioAtual * 0.05;
		}
		
		double novoSalario = salarioAtual + aumento;
		
		System.out.printf("Sal�rio antes do reajuste: R$%.2f\n", salarioAtual);
		System.out.printf("Percentual de aumento aplicado: %.2f%%\n", percentual);
		System.out.printf("Valor do aumento: R$%.2f\n", aumento);
		System.out.printf("Novo sal�rio: R$%.2f\n", novoSalario);
		
		scan.close();
	}
}
