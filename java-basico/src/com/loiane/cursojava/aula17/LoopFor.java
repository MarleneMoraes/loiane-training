package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//Acr�scimo
		for(int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		//Decr�scimo
		for(int i = 5; i < 0; i--) {
			System.out.println("i tem valor: " + i);
		}
		
		//For com mais de uma vari�vel
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		//For com partes ausentes
		int count = 0;
		for(; count <5 ; ) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("valor de count: " + cont);
		}
		
		//For sem corpo
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma � " + soma);
	}

}
