package com.loiane.estruturadados.aula035;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java 
 * Aula 35 - Lista Encadeada: Remover Elemento de qualquer posicao
 *
 */


public class Aula35 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		// lista.remove(0);

		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);
		lista.adiciona(4);
		lista.adiciona(5);

		System.out.println("Elemento removido:" + lista.remove(2));
	}
}
