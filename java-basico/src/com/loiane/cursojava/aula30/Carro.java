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
		System.out.println("Chamando construtos com 3 par�metros");
	}

	//Existe, mas n�o comum
	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.out.println("Chamando construtos com 2 par�metros");
	}
	

	void exibirAutonomia() {
			System.out.printf("A autonomia do carro �: %.2f km\n", (this.capCombustivel * this.consumoCombustivel));
		}
	
	
	
	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//M�todos com par�metro
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
