package com.loiane.estruturadados.aula022;

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
	
	public T desenfileira() {
		final int POS = 0; //boas práticas do Java
		
		if (this.estaVazia() == true) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		/*
		 * for (int i = POS; i < tamanho-1; i++){
		 * 	elementos[i] = elementos[i+1];
		 * }
		 * 
		 * tamanho--;
		 */
		
		return elementoASerRemovido;
	}

}
