package com.loiane.estruturadados.aula034;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java 
 * Aula 34 - Lista Encadeada: Remover Elemento do Final da Lista
 *
 */


public class Aula34 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		// lista.removeFinal();

		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);

		System.out.println("Elemento removido:" + lista.removeFinal());
	}
}
