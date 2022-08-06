package com.loiane.estruturadados.aula022;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 22 - Desenfileira (remover) elemento da fila (dequeue)
 *
 */

public class Aula22 {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		
		System.out.println(fila);
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila);
	}
}
