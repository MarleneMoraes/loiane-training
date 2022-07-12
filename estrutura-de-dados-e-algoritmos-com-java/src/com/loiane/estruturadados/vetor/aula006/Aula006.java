package com.loiane.estruturadados.vetor.aula006;

public class Aula006 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca("elemento 1"));
	}

}
