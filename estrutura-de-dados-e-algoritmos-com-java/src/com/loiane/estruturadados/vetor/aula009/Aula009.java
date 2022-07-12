package com.loiane.estruturadados.vetor.aula009;

public class Aula009 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		
		int pos = vetor.busca("E");
		if(pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
