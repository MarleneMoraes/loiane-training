package com.loiane.cursojava.aula19.labs;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 * ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[i].
 */

public class Ex003 {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] B = new int[15];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = (int) Math.pow(A[i], 2);
			
			if (i == 0) 
				System.out.print("B = [ " + B[i] + ", ");
			else if (i == A.length-1) 
				System.out.print(B[i] + " ]");
			else 
				System.out.print(B[i] + ", ");
			
		}

	}

}
