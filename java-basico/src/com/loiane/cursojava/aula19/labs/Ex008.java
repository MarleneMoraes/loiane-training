package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 8. Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C é a multiplicação 
 * dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i].
 */

public class Ex008 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] B = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] C = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] * B[i];
			
			if (i == 0) 
				System.out.print("C = [ " + C[i] + ", ");
			else if (i == A.length-1) 
				System.out.print(C[i] + " ]");
			else 
				System.out.print(C[i] + ", ");
			
		}

	}

}
