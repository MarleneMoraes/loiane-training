package com.loiane.estruturadados.aula004;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}

	public String busca(int posicao) {
		return this.elementos[posicao];
	}

	//Controle apenas da classe
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(); 

		//s += "[";
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			//s += this.elementos[i];
			s.append(this.elementos[i]);
			//s += ", ";
			s.append(", ");
		}

		if (this.tamanho > 0) {
			//s += this.elementos[this.tamanho -1];
			s.append(this.elementos[this.tamanho -1]);
		}

		//s += "]";
		s.append("]");

		//return Arrays.toString(elementos);
		return s.toString();

	}

}
