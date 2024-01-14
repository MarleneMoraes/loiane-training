package com.loiane.estruturadados.aula027;

import com.loiane.estruturadados.classesbase.ListaEncadeada;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 27 - Lista Encadeada: Tamanho da Lista
 *
 */

public class Aula27 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);
		
		System.out.println("Tamanho = " + lista.getTamanho());
		System.out.println(lista);
	}
}
