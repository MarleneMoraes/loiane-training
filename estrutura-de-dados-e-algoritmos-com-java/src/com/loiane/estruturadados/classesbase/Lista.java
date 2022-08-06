package com.loiane.estruturadados.classesbase;

import java.lang.reflect.Array;

public class Lista<T> extends EstruturaEstatica<T>{
	public Lista(int capacidade) {
		super(capacidade);
	}
	
	public Lista() {
		this(10);
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento){
		return super.adiciona(posicao, elemento);
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
	
	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	public boolean contem(T elemento) {
		int posicao = busca(elemento);
		
		if(posicao > -1) {
			return true;
		}
		
		return false;
	}
	
	public int ultimoindice(T elemento) {
		for (int i = this.tamanho-1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(T elemento) {
		int posicao = busca(elemento);
		if (posicao > -1) {
			remove(posicao);
		}
	}
	
	
	public void limpar() {
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		
		this.tamanho = 0;
	}

}
