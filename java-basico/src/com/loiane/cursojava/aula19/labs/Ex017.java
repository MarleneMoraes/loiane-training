package com.loiane.cursojava.aula19.labs;

/**
 * @author Marlene
 * @date 07-13-2022 
 * Exercícios de Java - Aula 19
 * 
 *       17.Ler um vetor A com 10 elementos inteiros correspondentes as idades
 *       de um grupo de pessoas. Escreva um programa que determine e escreva a
 *       quantidade de pessoas que possuem idade superior a 35 anos.
 * 
 */

public class Ex017 {
	public static void main(String[] args) {
		int[] A = { 12, 15, 18, 21, 23, 26, 30, 35, 40, 45 };
		int idadeSuperior = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 35)
				idadeSuperior++;
		}

		System.out.printf("Quantidade de pessoas que possuem idade superior a 35 anos: %d\n", idadeSuperior);

	}
}
