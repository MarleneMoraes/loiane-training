/*
 * 11. Faça um Programa que peça 2 números inteiros e um número real. 
 * Calcule e mostre:
 * 	a. o produto do dobro do primeiro com metade do segundo. 
 * 	b. a soma do triplo do primeiro com o terceiro.
 * 	c. o terceiro elevado ao cubo. 
 */


/**
 * @author Marlene
 * @since 2022-02-04
 */

package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int valor1, valor2;
		double valor3, produto, soma, potenciacao;
		
		System.out.println("CÁLCULO DE VALORES");
		
		System.out.print("Digite um valor inteiro: ");
		valor1 = scan.nextInt();
		
		System.out.print("Digite outro valor inteiro: ");
		valor2 = scan.nextInt();
		
		System.out.print("Digite um número real: ");
		valor3 = scan.nextDouble();
		
		
		// produto do dobro do primeiro com metade do segundo
		produto = (2 * valor1) * (0.5 * valor2);
		
		// soma do triplo do primeiro com o terceiro
		soma = (3 * valor1) + valor3;
		
		// terceiro elevado ao cubo
		potenciacao = Math.pow(valor3, 3);
		
		System.out.printf("Produto do dobro do primeiro com metade do segundo: %.2f\n", produto);
		System.out.printf("Soma do triplo do primeiro com o terceiro: %.2f\n", soma);
		System.out.printf("Terceiro elevado ao cubo: %.2f", potenciacao);
		
		scan.close();
	}

}
