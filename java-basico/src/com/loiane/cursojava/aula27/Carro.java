package com.loiane.cursojava.aula27;

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
	
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	//M�todos com par�metro
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
