package com.loiane.estruturadados.aula031;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 31 - Lista Encadeada: Buscar por Elemento ou Posicao na Lista
 *
 */

public class Aula31 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);

		System.out.println("BUSCA POR ELEMENTO");
		System.out.println(lista.busca(1));
		System.out.println(lista.busca(2));
		System.out.println(lista.busca(3));
		System.out.println(lista.busca(0));

		System.out.println("BUSCA POR POSICAO");
		System.out.println(lista.buscaPorPosicao(0));
		System.out.println(lista.buscaPorPosicao(1));
		System.out.println(lista.buscaPorPosicao(2));
		System.out.println(lista.buscaPorPosicao(-1));
		System.out.println(lista.buscaPorPosicao(4));
	}
}
