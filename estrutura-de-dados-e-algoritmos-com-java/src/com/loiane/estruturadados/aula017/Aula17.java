package com.loiane.estruturadados.aula017;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 17 - Desempilhar elemento (pop)
 *
 */

public class Aula17 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		
		System.out.println(pilha);
		
		System.out.println("Desempilhando elemento " + pilha.desempilha());
		
		System.out.println(pilha);
	}
}
