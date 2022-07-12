package com.loiane.cursojava.aula19.labs;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados
 * por 2, ou seja: B[i] = A[i] * 2.
 */

public class ex002 {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] B = new int[8];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i] * 2;
			
			if (i == 0) 
				System.out.print("B = [ " + B[i] + ", ");
			else if (i == A.length-1) 
				System.out.print(B[i] + " ]");
			else 
				System.out.print(B[i] + ", ");
			
		}

	}

}
