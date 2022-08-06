package com.loiane.estruturadados.aula023;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 23 - API Java: Queue
 *
 */

public class Aula23 {
	public static void main(String[] args) {
		/*
		 * Queue é uma interface da classe LinkedList (que representa a Lista Encadeada).
		 * Como as filas possuem limitações comparadas a LinkedList, o Java implementa uma
		 * interface para utilizá-la.
		 */
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1); //enfileira()
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue);
		
		System.out.println(queue.peek()); //espiar()
		
		System.out.println(queue.remove()); //desenfileira()
		
		System.out.println(queue);
	}
}
