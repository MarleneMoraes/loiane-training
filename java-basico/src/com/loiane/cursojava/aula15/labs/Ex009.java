/*
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 * */

/**
 * @author Marlene
 * @since 2022-02-06
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double[] numeros = new double[3];
		double[] ordemDecrescente = new double[3];

		System.out.println("Ordem decrescente");

		for (int i = 0; i <= 2; i++) {
			System.out.print("Digite um valor: ");
			numeros[i] = scan.nextDouble();
		}

		if (numeros[0] < numeros[1] && numeros[0] < numeros[2]) {
			
			ordemDecrescente[2] = numeros[0];
			
			if (numeros[1] < numeros[2]) {
				ordemDecrescente[1] = numeros[1];
				ordemDecrescente[0] = numeros[2];
			} else {
				ordemDecrescente[1] = numeros[2];
				ordemDecrescente[0] = numeros[1];
			}

			System.out.print("Ordem Decrescente: ");
			
			for (int i = 0; i <= 2; i++) 
				System.out.printf("%.1f  ", ordemDecrescente[i]);
			
		} else if (numeros[1] < numeros[0] && numeros[1] < numeros[2]) {

			ordemDecrescente[2] = numeros[1];
			
			if (numeros[0] < numeros[2]) {
				ordemDecrescente[1] = numeros[0];
				ordemDecrescente[0] = numeros[2];
			} else {
				ordemDecrescente[1] = numeros[2];
				ordemDecrescente[0] = numeros[0];
			}

			System.out.print("Ordem Decrescente: ");
			for (int i = 0; i <= 2; i++) {
				System.out.printf("%.1f  ", ordemDecrescente[i]);
			}
			
		} else {

			ordemDecrescente[2] = numeros[2];
			
			if (numeros[0] < numeros[1]) {
				ordemDecrescente[1] = numeros[0];
				ordemDecrescente[0] = numeros[1];
			} else {
				ordemDecrescente[1] = numeros[1];
				ordemDecrescente[0] = numeros[0];
			}

			System.out.print("Ordem Decrescente: ");
			for (int i = 0; i <= 2; i++) {
				System.out.printf("%.1f  ", ordemDecrescente[i]);
			}
		}
		
		scan.close();

	}

}
