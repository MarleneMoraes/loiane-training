package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 12.Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a soma de todos os elementos armazenados
 * neste vetor.
 */

public class Ex012 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		
		System.out.println("Soma: " + sum);
	}
}
