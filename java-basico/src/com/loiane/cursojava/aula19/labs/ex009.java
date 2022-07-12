package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 9. Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C é a divisão 
 * dos respectivos elementos em Ae B, ou seja: C[i] = A[i] / float(B[i]).
 */

public class ex009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		double[] C = new double[10];
		
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] / (double) B[i];
			
			if (i == 0) 
				System.out.printf("C = [  %.2f, ", C[i]);
			else if (i == A.length-1) 
				System.out.printf("%.1f ]", C[i]);
			else 
				System.out.printf("%.2f, ", C[i]);
			
		}

	}

}
