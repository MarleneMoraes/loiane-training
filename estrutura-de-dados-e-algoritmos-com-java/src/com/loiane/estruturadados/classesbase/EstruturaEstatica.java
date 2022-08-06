package com.loiane.estruturadados.classesbase;

public class EstruturaEstatica<T> {
	private T[] elementos;
	private int tamanho;

	public EstruturaEstatica() {
		this(10);
	}
	
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
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

	private void aumentaCapacidade() {
		// TODO Auto-generated method stub
		
	}
}

