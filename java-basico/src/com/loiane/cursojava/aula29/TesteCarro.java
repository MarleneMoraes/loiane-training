package com.loiane.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro(); //o Carro() é o mesmo que declarar na classe Carro um construtor simples e vazio
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10; //caso não seja atribuído valor, o valor que aparecerá será do construtor
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro2 van2 = new Carro2();
		
	}

}
