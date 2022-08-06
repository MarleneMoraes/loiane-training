package com.loiane.estruturadados.classesbase;

public class Fila<T> extends EstruturaEstatica<T>  {
	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		return this.elementos[0];
	}
	
	public T desenfileira() {
		final int POS = 0;
		
		if (this.estaVazia() == true) {
			return null;
		}
		
		T elementoDesenfileira = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoDesenfileira;
	}
}
