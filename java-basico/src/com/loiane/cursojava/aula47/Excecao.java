package com.loiane.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		/*
		int[] vetor = new int[4];
		
		System.out.println("Antes da exception");

		vetor[4] = 1;
		
		 * ArrayIndexOutOfBoundsException: acesso a uma posição que não existe
		 	
		 	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 
				at com.loiane.cursojava.aula47.Excecao.main(Excecao.java:10)
				
		 * O programa termina após o erro e não compila o código seguinte
		 
		
		System.out.println("Este texto não será impresso");
		
		*/
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");

			vetor[4] = 1;
			 
			System.out.println("Este texto não será impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		System.out.println("Este texto será impresso após a exception");
		
	}

}
