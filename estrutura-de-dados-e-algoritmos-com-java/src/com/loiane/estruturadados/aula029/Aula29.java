package com.loiane.estruturadados.aula029;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 29 - Lista Encadeada: Percorrer a Lista
 *
 */

public class Aula29 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);

		System.out.println("Tamanho = " + lista.getTamanho());
		System.out.println(lista);

		lista.adiciona(2);
		System.out.println(lista);

		lista.adiciona(3);
		System.out.println(lista);
	}
}
