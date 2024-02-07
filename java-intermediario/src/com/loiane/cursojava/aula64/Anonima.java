package com.loiane.cursojava.aula64;

public class Anonima {
	// Classe Anonima - instanciacao em tempo de execucao
	public void imprimeTexto() {
		System.out.println("qualquer texto");
	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima() { // sobrescrever sua instanciacao
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};

		anonima.imprimeTexto();

		// classes anonimas podem usar interfaces
		Texto texto = new Texto() {
			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};

		texto.imprimeTexto();
	}

}