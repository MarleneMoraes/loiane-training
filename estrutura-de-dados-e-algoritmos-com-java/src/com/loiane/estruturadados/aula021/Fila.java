package com.loiane.estruturadados.aula021;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		/*
		 * this.elementos[this.tamanho] = elemento;
		 * this.tamanho++;
		 * 
		 * this.elementos[this.tamanho+
		 */
		
		this.adiciona(elemento);
	}
	
	
	public T espiar() {
	/*
	 * precaucao de verificacao do codigo
	 * 
	 * if (this.estaVazia() == true) {
	 * 	return null;
	 * }
	 */
	
		return this.elementos[0];
	}

}
