package com.loiane.estruturadados.aula004;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 04 - Verificar tamanho e imprimir elementos do vetor
 *
 */

public class Aula004 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		System.out.println(vetor.tamanho());

		System.out.println(vetor); //System.out.println(vetor.toString());
	}

}
