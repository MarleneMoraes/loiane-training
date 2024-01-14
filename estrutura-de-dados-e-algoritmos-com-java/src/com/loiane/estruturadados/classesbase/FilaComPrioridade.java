package com.loiane.estruturadados.classesbase;

public class FilaComPrioridade<T> extends Fila<T> {

	@Override
	public void enfileira(T elemento) {
		@SuppressWarnings("unchecked")
		Comparable<T> chave = (Comparable<T>) elemento; //ver em classe Paciente
		
		int i;
		for (i = 0; i < this.tamanho; i++) {
			if (chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
	}
}
