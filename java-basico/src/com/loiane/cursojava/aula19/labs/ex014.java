package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a média aritmética simples dos elementos
 * ímpares armazenados neste vetor.

 */

public class ex014 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double avg = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				avg += A[i];
			}		
		}
		
		avg /= A.length;
	
		System.out.printf("Média Aritmética dos ímpares: %.1f ", avg);

	}
}
