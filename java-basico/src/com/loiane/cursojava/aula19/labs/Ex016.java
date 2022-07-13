package com.loiane.cursojava.aula19.labs;

/**
 * @author Marlene
 * @date 07-13-2022 
 * Exercícios de Java - Aula 19
 * 
 *       16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
 *       que calcule e escreva: 
 *       a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
 *       b) a quantidade de elementos armazenados no vetor que são iguais a 15; e 
 *       c) a média dos elementos armazenados no vetor que são superiores a 15.
 * 
 */

public class Ex016 {
	public static void main(String[] args) {
		int[] A = { 1, 5, 10, 15, 20, 25, 30, 35, 40, 45 };
		int soma = 0, qtdElemQuinze = 0, maiorQuinze = 0;
		double media = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 15)
				soma += A[i];

			if (A[i] == 15)
				qtdElemQuinze++;
			
			if (A[i] > 15) {
				media += A[i];
				maiorQuinze++;
			}		
		}
		
		media /= maiorQuinze;
		
		System.out.printf("Soma dos menores que 15: %d\n", soma);
		System.out.printf("Quantidade dos iguais a 15: %d\n", qtdElemQuinze);
		System.out.printf("Média dos maiores que 15: %.2f\n", media);
		
	}
} 
