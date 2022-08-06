package com.loiane.estruturadados.aula008;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 08 - Aumentar capacidade do vetor-
 *
 */

public class Aula008 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);
	}

}
