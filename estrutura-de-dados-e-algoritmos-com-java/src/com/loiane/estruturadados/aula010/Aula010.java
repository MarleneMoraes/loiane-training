package com.loiane.estruturadados.aula010;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 10 - Generalizar o tipo do vetor-
 *
 */

public class Aula010 {

	public static void main(String[] args) {
		//Generalizar o tipo do Vetor: Classe Object
		VetorObjetos vetor = new VetorObjetos(3);
		
		/*
		 * vetor.adiciona(3);
		 * vetor.adiciona(4);
		 * vetor.adiciona(5);
		 */
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		
		Contato c4 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		//int pos = vetor.busca(c1);
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println("Contato: ");
		System.out.println(vetor);
		
		
	}
}
