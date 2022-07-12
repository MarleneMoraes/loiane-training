package com.loiane.cursojava.aula32;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		//van.marca = "Fiat";
		
		//atribuir valor
		van.setMarca("Fiat");
		
		//obtenção de valor
		System.out.println(van.getMarca());
		
		
	}

}
