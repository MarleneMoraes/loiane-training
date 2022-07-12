package com.loiane.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		/*
		int[] vetor = new int[4];
		
		System.out.println("Antes da exception");

		vetor[4] = 1;
		
		 * ArrayIndexOutOfBoundsException: acesso a uma posi��o que n�o existe
		 	
		 	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 
				at com.loiane.cursojava.aula47.Excecao.main(Excecao.java:10)
				
		 * O programa termina ap�s o erro e n�o compila o c�digo seguinte
		 
		
		System.out.println("Este texto n�o ser� impresso");
		
		*/
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");

			vetor[4] = 1;
			 
			System.out.println("Este texto n�o ser� impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe");
		}
		System.out.println("Este texto ser� impresso ap�s a exception");
		
	}

}
