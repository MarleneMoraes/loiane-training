package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 * ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
 * seja: B[i] = A[i] % 2.
 */

public class Ex010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1010};
		int[] B = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i] % 2;
			
			if (i == 0) 
				System.out.printf("B = [  %d, ", B[i]);
			else if (i == A.length-1) 
				System.out.printf("%d ]", B[i]);
			else 
				System.out.printf("%d, ", B[i]);
			
		}

	}

}
