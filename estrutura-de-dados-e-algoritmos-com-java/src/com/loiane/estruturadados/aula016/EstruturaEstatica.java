package com.loiane.estruturadados.aula016;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	protected void posicaoInvalida(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
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
	
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}
	
	protected boolean adiciona(int posicao, T elemento){

		posicaoInvalida(posicao);

		this.aumentaCapacidade();

		for (int i = this.tamanho-1; i >= posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	protected void remove(int posicao){
		posicaoInvalida(posicao);
		
		for (int i = posicao; i < tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		
		tamanho--;
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
	
}

