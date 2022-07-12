package com.loiane.estruturadados.vetor.aula009;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}
	
	public void adiciona(int posicao, String elemento) {
		this.aumentaCapacidade();
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i]; 
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length*2];
			
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			
			this.elementos = elementosNovos;
		}
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * 0   1   2   3   4   ->  tamanho é 5
	 * B   C   E   F   G -> posição a ser removida é 1(G)
	 * 
	 * vetor[1] = vetor[2];
	 * vetor[2] = vetor[3];
	 * vetor[3] = vetor[4];
	 */
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
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

}
