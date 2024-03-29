package com.loiane.estruturadados.aula006;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 06 - Verificar se elemento existe no vetor (busca sequencial)
 *
 */

public class Aula006 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		System.out.println(vetor.busca("elemento 1"));
	}

}
