package com.loiane.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	/*
 		void exibirAutonomia() {
			System.out.printf("A autonomia do carro é: %.2f km\n", (capCombustivel * consumoCombustivel));
		}
	*/
	
	//Métodos com retorno
	double obterAutonomia() {
		System.out.println("Método obter obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
}
