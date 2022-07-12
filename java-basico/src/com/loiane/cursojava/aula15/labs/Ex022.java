/*
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * 						Até 5Kg				Acima de 5Kg
 *		Morango		R$2,50 por Kg			R$2,20 por Kg
 *		Maçã		R$1,80 por Kg			R$1,50 por Kg
 *
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
 * ultrapassar R$25,00, receberá ainda um desconto de 10% sobre este total.
 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a 
 * quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo 
 * cliente.
 *
 */

/**
 * @author Marlene
 * @since 2022-02-07
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("FRUTEIRA");
		double preco = 0.0;
		double quantidadeMorangos = 0.0;
		double quantidadeMaca = 0.0;
		double pesoFruta = 0.0;
		
		System.out.print("Peso do Morango: ");
		pesoFruta = scan.nextDouble();

		quantidadeMorangos = pesoFruta;
		double quantidadeTotal = quantidadeMorangos;
		
		if (pesoFruta > 0.0 && pesoFruta <= 5.0) {
			preco += 2.5 * pesoFruta;
		} else if (pesoFruta > 0.0 && pesoFruta > 5.0) {
			preco += 2.2 * pesoFruta;
		}
			
		System.out.print("Peso da Maçã: ");
		pesoFruta = scan.nextDouble();
		
		quantidadeMaca = pesoFruta; 
		quantidadeTotal += quantidadeMaca;
		
		if (pesoFruta > 0.0 && pesoFruta <= 5.0) {
			preco += 2.5 * pesoFruta;
		} else if (pesoFruta > 0.0 && pesoFruta > 5.0) {
			preco += 2.2 * pesoFruta;
		}
	
			
		if (quantidadeTotal > 8.0 || preco > 25.0) {
			preco -= (preco * 0.1);
		}
		
		System.out.printf("Quantidade de morangos (em kg): %.1f\n", quantidadeMorangos);
		System.out.printf("Quantidade de maçã (em kg): %.1f\n", quantidadeMaca);
		System.out.printf("Valor total: R$%.2f", preco);
		
		scan.close();
	}
}
