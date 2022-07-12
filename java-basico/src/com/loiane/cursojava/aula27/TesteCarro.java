package com.loiane.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van); //endereço de memória
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		//van.exibirAutonomia();
		
		/*
		 * double autonomia = van.obterAutonomia();
		 * System.out.printf("A autonomia do carro é: %.2f km", autonomia);
		 */
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.printf("qtdCombustivel10 = %.2f\n", qtdCombustivel10);
		System.out.printf("qtdCombustivel15 = %.2f\n", qtdCombustivel15);
		
	}

}
