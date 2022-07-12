package com.loiane.cursojava.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	

	public void exibirAutonomia() {
			System.out.printf("A autonomia do carro é: %.2f km\n", (this.capCombustivel * this.consumoCombustivel));
		}
	
	
	
	public double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	
	public double calcularCombustivel(double km) {
		return this.divideKMPorConsumoCombustivel(km);
	}
}
