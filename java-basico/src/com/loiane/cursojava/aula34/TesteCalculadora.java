package com.loiane.cursojava.aula34;

public class TesteCalculadora {
	
	static int resultadoDaSoma;

	public static void main(String[] args) {
		/*
		 * MinhaCalculadora calculadora = new MinhaCalculadora();
		 * calculadora.soma(1, 2);
		*/
		
		//Classes utilitárias MinhaCalculadora.soma(1, 2);
		
		resultadoDaSoma = MinhaCalculadora.soma(1, 2);
		soma2Valores(1, 2);
		
	}
	
	static int soma2Valores (int num1, int num2) {
		return MinhaCalculadora.soma(1, 2);
	}
	

}
