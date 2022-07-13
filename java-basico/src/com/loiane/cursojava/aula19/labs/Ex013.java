package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que determine a soma dos elementos armazenados neste vetor que
 * são múltiplos de 5.

 */

public class Ex013 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 5 == 0) {
				sum += A[i];
			}		
		}
	
		System.out.printf("Soma dos múltiplos de 5: %d ", sum);

	}
}
