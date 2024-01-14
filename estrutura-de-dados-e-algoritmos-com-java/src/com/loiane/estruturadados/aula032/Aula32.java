package com.loiane.estruturadados.aula032;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java 
 * Aula 32 - Lista Encadeada: Adicionar Elemento em qualquer posicao da lista
 *
 */

public class Aula32 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adicionaInicio(3);
		lista.adicionaInicio(2);
		lista.adicionaInicio(1);

		System.out.println(lista);

		// -----------------------

		ListaEncadeada<Integer> numeros = new ListaEncadeada<>();

		// numeros.adiciona(-1, 1); // Exception
		numeros.adiciona(1);
		numeros.adiciona(2);
		numeros.adiciona(4);

		// numeros.adiciona(5, 0); // Exception
		numeros.adiciona(0, 0); // 0, 1, 2, 4
		numeros.adiciona(4, 5); // 0, 1, 2, 4, 5
		numeros.adiciona(2, 3); // 0, 1, 2, 3, 4, 5

		System.out.println(numeros);
	}
}
