package com.loiane.estruturadados.aula024;

public class FilaComPrioridade<T> extends Fila<T> {

	@Override
	public void enfileira(T elemento) {
		/*
		 * for (int i = 0; i < this.elementos.length; i++) {
		 * 	if (elemento < this.elementos[i]) { //erro de compilação, pois não está definido o tipo
		 * 		this.adiciona(i, elemento);
		 * 		break;
		 * 	}
		 * }
		 */
		
		Comparable<T> chave = (Comparable<T>) elemento; //ver em classe Paciente
		
		int i;
		for (i = 0; i < this.tamanho; i++) {
			if (chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}

	}
}
