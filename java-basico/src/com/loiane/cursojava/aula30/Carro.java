package com.loiane.cursojava.aula30;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public Carro() { }
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtos com 3 parâmetros");
	}

	//Existe, mas não comum
	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.out.println("Chamando construtos com 2 parâmetros");
	}
	

	void exibirAutonomia() {
			System.out.printf("A autonomia do carro é: %.2f km\n", (this.capCombustivel * this.consumoCombustivel));
		}
	
	
	
	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//Métodos com parâmetro
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
