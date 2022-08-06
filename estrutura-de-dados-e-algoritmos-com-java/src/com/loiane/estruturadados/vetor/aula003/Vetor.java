package com.loiane.estruturadados.vetor.aula003;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * //Op��o menos eficaz 
	 * public void adiciona(String elemento) { 
	 * 		for (int i = 0; i < this.elementos.length; i++) { 
	 * 			if (this.elementos[i] == null) { //em um array de Strings, o elemento vazio, por padrão, é nulo 
	 * 				this.elementos[i] = elemento; 
	 * 				break; 
	 * 			} 
	 * 		} 
	 * }
	 * 
	 * //Op��o com exce��es 
	 * public void adiciona(String elemento) throws Exception {
	 * 		if (this.tamanho < this.elementos.length) { 
	 * 			this.elementos[this.tamanho] = elemento; 
	 * 			this.tamanho++; 
	 * 		} else { 
	 * 			throw new Exception("Vetor cheio, n�o � poss�vel adicionar mais elementos."); 
	 * 		}
	 * }
	 */

	// Op��o mais eficaz
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}
}
