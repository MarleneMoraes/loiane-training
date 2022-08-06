package com.loiane.estruturadados.aula021;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 21 - Espiar/Verificar elemento in�cio da fila (peek)
 *
 */

public class Aula21 {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(3);
		fila.enfileira(1);
		fila.enfileira(2);
		
		System.out.println(fila.espiar());
		
		System.out.println(fila);
	}
}
