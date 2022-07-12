/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * 	- Álcool
 * 		a. até 20 litros, desconto de 3% por litro
 * 		b. acima de 20 litros, desconto de 5% por litro
 * 	- Gasolina
 * 		a. até 20 litros, desconto de 4% por litro
 * 		b. acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de 
 * combustível (codificado da seguinte forma: A - álcool, G - gasolina), 
 * calcule e imprima o valor a ser pago pelo cliente sabendo-se que o 
 * preço do litro da gasolina é R$2,50 e o preço do litro do álcool é de
 * R$1,90. 
 * 
 */

/**
 * @author Marlene
 * @since 2022-02-07
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("POSTO DE GASOLINA");
		System.out.print("Litros vendidos: ");
		double litrosVendidos = scan.nextDouble();
		double preco = 0, descontos = 0;
		
		System.out.print("Tipo de combustível (A - álcool, G - gasolina):");
		char combustivel = scan.next().charAt(0);
		
		if (combustivel == 'A' || combustivel == 'a') {
			preco = 1.9 * litrosVendidos;
	
			if (litrosVendidos > 0 && litrosVendidos <= 20) {
				descontos = preco * 0.03;
				preco -= descontos;
			} else {
				descontos = preco * 0.05;
				preco -= descontos;
			}
			
			System.out.printf("Valor total: R$%.2f", preco);
			
		} else if (combustivel == 'G' || combustivel == 'g') {
			preco = 2.5 * litrosVendidos;
			if (litrosVendidos > 0 && litrosVendidos <= 20) {
				descontos = preco * 0.04;
				preco -= descontos;
			} else {
				descontos = preco * 0.06;
				preco -= descontos;
			}
			
			System.out.printf("Valor total: R$%.2f", preco);
			
		} else {
			System.out.println("ERRO NO SISTEMA.");
		}
		
		scan.close();
	}

}
