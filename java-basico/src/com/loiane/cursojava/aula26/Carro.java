package com.loiane.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	/*
 		void exibirAutonomia() {
			System.out.printf("A autonomia do carro �: %.2f km\n", (capCombustivel * consumoCombustivel));
		}
	*/
	
	//M�todos com retorno
	double obterAutonomia() {
		System.out.println("M�todo obter obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
}
