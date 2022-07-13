package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 7. Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C é a subtração 
 * dos respectivos elementos em A e B, ou seja: C[i] = A[i] - B[i].
 */

public class Ex007 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] B = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] C = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] - B[i];
			
			if (i == 0) 
				System.out.print("C = [ " + C[i] + ", ");
			else if (i == A.length-1) 
				System.out.print(C[i] + " ]");
			else 
				System.out.print(C[i] + ", ");
			
		}

	}

}
