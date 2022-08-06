package com.loiane.estruturadados.aula015;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 15 - Verificar se pilha está vazia
 *
 */

public class Aula15 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia()); //true
		
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia()); //false
	}
}
