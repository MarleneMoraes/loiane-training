package com.loiane.estruturadados.aula036;

import java.util.LinkedList;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java 
 * Aula 36 - Lista Encadeada: API LinkedList e Conclusao do Curso
 *
 */


public class Aula36 {
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<>();

		lista.add(1);
		lista.addFirst(0);
		lista.addLast(3);

		System.out.println(lista.contains(2)); // false

		lista.add(2, 2);
		
		System.out.println(lista.contains(2)); // true
		
		System.out.println(lista);
		
		lista.remove();
		lista.removeFirst();
		lista.removeLast();
		
		System.out.println(lista);
	}
}
