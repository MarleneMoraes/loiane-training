package com.loiane.cursojava.aula19.labs;

/**
 * @author Marlene
 * @date 07-11-2022
 * Exercícios de Java - Aula 19
 * 
 * 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
 * seja, B[i] = A[i].
 */

public class ex001 {
	public static void main(String[] args) {
		int [] A = {1, 2, 3, 4, 5};
		int [] B = new int[5];
		
		for (int i = 0;  i < A.length; i++) {
			B[i] = A[i];
			
			if (i == 0) 
				System.out.print("B = [ " + B[i] + ", ");
			else if (i == A.length-1) 
				System.out.print(B[i] + " ]");
			else 
				System.out.print(B[i] + ", ");
		}
			
	}

}
