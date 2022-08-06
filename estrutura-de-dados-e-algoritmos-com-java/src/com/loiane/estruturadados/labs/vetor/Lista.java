package com.loiane.estruturadados.labs.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	private void posicaoInvalida(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
	}

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}
	
	public void adiciona(int posicao, T elemento) {
		this.aumentaCapacidade();
		
		posicaoInvalida(posicao);
		
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i]; 
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			
			this.elementos = elementosNovos;
		}
	}

	public T busca(int posicao) {
		posicaoInvalida(posicao);
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao) {
		posicaoInvalida(posicao);
		
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}
	
	/*
	 * Exercício 01
	 * Melhore a classe Lista e implemente o metodo contem,
	 * semelhante ao metodo contains da classe ArrayList
	 * */
	
	public boolean contem(T elemento) {
		int posicao = busca(elemento);
		
		if(posicao > -1) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * Exercício 02
	 * Melhore a classe Lista e implemente o metodo ultimoindice,
	 * semelhante ao metodo lastIndexOf da classe ArrayList
	 * */
	
	public int ultimoindice(T elemento) {
		for (int i = this.tamanho-1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * Exercício 03
	 * Melhore a classe Lista e implemente o metodo remove(T elemento),
	 * onde sera possivel remover um elemento da lista passando o mesmo como parametro.
	 * */
	
	public void remove(T elemento) {
		int posicao = busca(elemento);
		if (posicao > -1) {
			remove(posicao);
		}
	}

	
	/*
	 * Exercício 04
	 * Melhore a classe Lista e implemente o metodo obtem(int posicao),
	 * onde sera possivel obter o elemento dada uma posicao do vetor.
	 * Esse metodo e semelhante ao metodo get(int posicao) da classe ArrayList.
	 * */
	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	/*
	 * Exercício 05
	 * Melhore a classe Lista e implemente o metodo limpar,
	 * onde todos os elementos da lista serão removidos.
	 * Esse metodo e semelhante ao metodo clear da classe ArrayList.
	 * */

	public void limpar() {
		//metodo custoso mas possui liberacao de memoria
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		
		this.tamanho = 0;
		
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//this.tamanho = 0;
	}

}

