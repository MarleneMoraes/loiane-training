package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Métodos simples
	void exibirAutonomia() {
		System.out.printf("A autonomia do carro é: %.2f km\n", (capCombustivel * consumoCombustivel));
	}
	
}
