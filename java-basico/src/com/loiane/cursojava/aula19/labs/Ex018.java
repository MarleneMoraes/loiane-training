package com.loiane.cursojava.aula19.labs;

/**
 * @author Marlene
 * @date 07-13-2022 
 * Exercícios de Java - Aula 19
 * 
 *       18.Ler um vetor A com 10 elementos inteiros correspondentes as idades
 *       de um grupo de pessoas. Escreva um programa que determine e escreva a
 *       menor e a maior idades e suas respectivas posições.
 * 
 */

public class Ex018 {
	public static void main(String[] args) {
		int[] A = { 12, 15, 18, 21, 23, 26, 30, 35, 40, 45 };
		int maiorIdade = 0, menorIdade = 0;

		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				maiorIdade = A[i];
				menorIdade = A[i];
			} else {
				maiorIdade = Math.max(maiorIdade, A[i]);
				menorIdade = Math.min(menorIdade, A[i]);	
			}
					
		}
		
		System.out.println("Menor: " + menorIdade);
		System.out.println("Maior: " + maiorIdade);

	}

}
