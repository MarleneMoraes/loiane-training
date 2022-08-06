package com.loiane.estruturadados.aula013;

import java.lang.reflect.Array;

public class Lista2<T> extends EstruturaEstatica<T> {
	public Lista2() {
		super();
	}
	
	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento) {
		return super.adiciona(elemento);
	}
	
	public void remove(int posicao) {
		super.remove(posicao);
	}
	
	public T busca(int posicao) {
		posicaoInvalida(posicao);
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < super.tamanho(); i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

}
