package com.loiane.cursojava.aula54;

public enum DiaSemana {
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

	// Atributo
	private int valor;

	// Construtor
	DiaSemana(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}
}
