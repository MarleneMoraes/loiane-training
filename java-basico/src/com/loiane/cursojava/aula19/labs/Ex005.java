package com.loiane.cursojava.aula19.labs;

import java.util.Locale;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo 
 * e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento 
 * de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.
 */

public class Ex005 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] B = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i] * i;
			
			if (i == 0) 
				System.out.print("B = [ " + B[i] + ", ");
			else if (i == A.length-1) 
				System.out.print(B[i] + " ]");
			else 
				System.out.print(B[i] + ", ");
			
		}

	}

}
