package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a quantidade de elementos armazenados neste
 * vetor que são pares.
 */

public class Ex011 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < A.length; i++) {
			if (i ==0) 
				System.out.print("Pares = [ ");
			
			if (A[i]%2== 0) {
				if (i == A.length-1)
					System.out.printf("%d", A[i]);
				else 
					System.out.printf("%d, ", A[i]);
			}
			
			if (i == A.length-1)  
				System.out.print(" ]");
		}
	}
}
