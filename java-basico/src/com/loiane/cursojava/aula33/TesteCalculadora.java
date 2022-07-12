package com.loiane.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		MinhaCalculadora calculadora = new MinhaCalculadora();
		
		int soma1 = calculadora.soma(1, 2);
		System.out.println(soma1);
		
		double soma2 = calculadora.soma(1.0, 2.0);
		System.out.println(soma2);
		
		int soma3 = calculadora.soma(1, 2, 3);
		System.out.println(soma3);
	}

}
