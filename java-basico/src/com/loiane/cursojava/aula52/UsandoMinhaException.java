package com.loiane.cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {
		/*
		 * Uma forma de fazer:
		 	int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
			int[] denominadores = { 2, 0, 4, 8, 0, 2, 4};

			for (int i = 0; i < numeros.length; i++) {
				try {
					if (numeros[i] % 2 != 0) {
						//lançar a exception aqui
						//throw new Exception("Número ímpar, divisão não exata");
						throw new DivisaoNaoExata(numeros[i], denominadores[i]);//Exception própria
					}
					System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
				} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e){
					System.out.println("Aconteceu um erro");
					e.printStackTrace();
				} 
			}
	*/
		
		try {
			teste();
		} catch(DivisaoNaoExata e) {
			e.printStackTrace();
		}
	}
	
	public static void teste() throws DivisaoNaoExata {
		int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0, 2, 4};

		for (int i = 0; i < numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
					throw new DivisaoNaoExata(numeros[i], denominadores[i]);//Exception própria
				}
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			} 
		}
	}

}
