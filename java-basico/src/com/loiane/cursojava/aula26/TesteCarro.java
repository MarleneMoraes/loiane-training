package com.loiane.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van); //endere�o de mem�ria
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		//van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.printf("A autonomia do carro �: %.2f km", autonomia);
		
	}

}
