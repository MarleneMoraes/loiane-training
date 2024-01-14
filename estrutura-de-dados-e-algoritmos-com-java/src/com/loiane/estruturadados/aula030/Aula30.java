package com.loiane.estruturadados.aula030;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 30 - Lista Encadeada: Limpar a Lista
 *
 */

public class Aula30 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);
		
		lista.adiciona(2);
		
		lista.adiciona(3);
		System.out.println(lista);
		
		lista.limpa();
		System.out.println(lista);
	}
}
