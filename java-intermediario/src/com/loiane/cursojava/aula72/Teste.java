package com.loiane.cursojava.aula72;

public class Teste {
	public static void main(String[] args) {

		TiqueTaque tiqueTaque = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tiqueTaque);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tiqueTaque);

		try {
			tique.thread.join();
			taque.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
