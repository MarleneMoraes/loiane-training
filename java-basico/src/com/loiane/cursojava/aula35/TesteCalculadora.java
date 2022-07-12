package com.loiane.cursojava.aula35;

public class TesteCalculadora {
	
	static int resultadoDaSoma;

	public static void main(String[] args) {
		int fatorialNR = MinhaCalculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = MinhaCalculadora.fatorial(5); //mesmo resultado
		System.out.println(fatorialR);
	
	}

}
