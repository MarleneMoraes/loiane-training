package com.loiane.cursojava.aula27;

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
	
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	//Métodos com parâmetro
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
