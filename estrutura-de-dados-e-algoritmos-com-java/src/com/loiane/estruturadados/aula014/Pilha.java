package com.loiane.estruturadados.aula014;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 14 - Empilhar Elemento (push)
 *
 */

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
}
