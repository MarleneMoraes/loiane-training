package com.loiane.estruturadados.aula033;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java 
 * Aula 33 - Lista Encadeada: Remover Elemento no Inicio da Lista
 *
 */


public class Aula33 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		// lista.removeInicio();

		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);

		System.out.println("Elemento removido:" + lista.removeInicio());
	}
}
