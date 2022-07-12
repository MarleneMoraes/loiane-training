/*
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos 
 * são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3%
 * para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado 
 * (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os 
 * descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de 
 * horas trabalhadas no mês.
 * 
 *    Desconto do IR:
 *    
 *    Salário Bruto até 900 (inclusive) - isento
 *    Salário Bruto até 1500 (inclusive) - desconto de 5%
 *    Salário Bruto até 2500 (inclusive) - desconto de 10%
 *    Salário Bruto acima de 2500 (inclusive) - desconto de 20%. 
 *    
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo, o 
 * valor da hora é 5 e a quantidade de hora é 220
 * 
 * 		Salário Bruto: (5 * 220)		: R$1100,00
 * 		(-) IR (5%)						: R$  55,00
 * 		(-) INSS (10%)					: R$ 110,00
 * 		FGTS (11%)						: R$ 121,00
 * 		Total de descontos				: R$ 165,00
 * 		Salário Líquido					: R$ 935,00
 * 
 */

/**
 * @author Marlene
 * @since 2022-02-09
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("CÁLCULO FOLHA DE PAGAMENTO");
		System.out.print("Valor da hora: ");
		double valorHoras = scan.nextDouble();

		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = valorHoras * horasTrabalhadas; 
		int ir = 0;
		double valorIR = 0;
		
		if (salarioBruto <= 900) {
			ir = 0;
			valorIR = 0;
		} else if (salarioBruto <= 1500) {
			ir = 5;
			valorIR = salarioBruto * 0.05;
		} else if (salarioBruto <= 2500) {
			ir = 10;
			valorIR = salarioBruto * 0.1;		
		} else {
			ir = 20;
			valorIR = salarioBruto * 0.2;
		}
		
		double inss = salarioBruto * 0.1;
		double fgts = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.03;
		double totalDescontos = valorIR + inss;

		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.printf("Salário Bruto: (%.0f * %d)			: R$%.2f\n", valorHoras, horasTrabalhadas, salarioBruto);
		System.out.printf("(-) IR (%d%%)					: R$%.2f\n", ir, valorIR);
		System.out.printf("(-) INSS (10%%)					: R$%.2f\n", inss);
		System.out.printf("(-) sindicato (3%%)				: R$%.2f\n", sindicato);
		System.out.printf("FGTS (11%%)					: R$%.2f\n", fgts);
		System.out.printf("Total de descontos				: R$%.2f\n", totalDescontos);
		System.out.printf("Salário Líquido					: R$%.2f\n", salarioLiquido);
		
		scan.close();
	}

}
