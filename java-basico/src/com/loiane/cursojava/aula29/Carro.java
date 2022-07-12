package com.loiane.cursojava.aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro() {
		System.out.println("Classe Carro foi instanciada.");
		numPassageiros = 4;
	}
	
	
	//Construtores que substituem as linhas de código apresentadas na classe TesteCarro
	public Carro (String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}



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
