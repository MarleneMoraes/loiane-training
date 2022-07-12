package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 * mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
 * raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
 */

public class ex004 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		double[] B = new double[15];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = Math.sqrt(A[i]);
			
			if (i == 0) 
				System.out.printf("B = [  %.2f, ", B[i]);
			else if (i == A.length-1) 
				System.out.printf("%.2f ]", B[i]);
			else 
				System.out.printf("%.2f, ", B[i]);
			
		}

	}

}
