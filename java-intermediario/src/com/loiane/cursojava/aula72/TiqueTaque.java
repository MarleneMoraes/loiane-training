package com.loiane.cursojava.aula72;

public class TiqueTaque {
	boolean tique;

	// Para a utilizacao dos metodos wait, notify e notifyAll precisa
	// que os blocos de codigo sejam sincronizados
	synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		try {
			while (tique) {
				wait(); // wait precisa de tratamento de excecao
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");

		tique = false;

		notify();

		try {
			while (!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
