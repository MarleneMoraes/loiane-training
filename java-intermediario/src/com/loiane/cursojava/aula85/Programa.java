package com.loiane.cursojava.aula85;

public class Programa {
	public static void main(String[] args) {

		// Classe Math - funcoes trigonometricas, exponenciais, arredondamento, entre outros
		
		// Potenciacao
		System.out.println(Math.pow(2, 3));

		// Arredondamento
		System.out.println(Math.round(4.7));

		System.out.println(Math.round(4.4));
		
		System.out.println(Math.ceil(4.4)); // para cima

		System.out.println(Math.ceil(4.7));

		System.out.println(Math.floor(4.4)); // para baixo

		System.out.println(Math.floor(4.7));

		System.out.println(Math.round(Math.random() * 100)); // num aleatorio ate 100

		// Seno
		System.out.println(Math.sin(Math.toRadians(30))); // sin trabalha com radianos, deve transformar atraves do toRadians

		// Cosseno
		System.out.println(Math.cos(Math.toRadians(1)));

		// Tangente
		System.out.println(Math.tan(Math.toRadians(45)));
		
		// outros: sqrt(), cbrt(), log(), scalb(), floorMod(), 
		//		   addExact(), random(), toRadins(), to Degrees()
		
		// Para seguridade e precisao, deve-se utilizar as classes BigNumber e BigDecimal

	}
}
