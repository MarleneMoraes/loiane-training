package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//M�todos simples
	void exibirAutonomia() {
		System.out.printf("A autonomia do carro �: %.2f km\n", (capCombustivel * consumoCombustivel));
	}
	
}
