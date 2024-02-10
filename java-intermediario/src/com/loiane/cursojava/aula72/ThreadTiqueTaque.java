package com.loiane.cursojava.aula72;

public class ThreadTiqueTaque implements Runnable {

	TiqueTaque tiqueTaque;
	Thread thread;

	final int NUM = 5;

	public ThreadTiqueTaque(String nome, TiqueTaque tiqueTaque) {
		this.tiqueTaque = tiqueTaque;
		thread = new Thread(this, nome);
		thread.start();
	}

	@Override
	public void run() {

		if (thread.getName().equalsIgnoreCase("Tique")) {
			
			for (int i = 0; i < NUM; i++) {
				tiqueTaque.tique(true);
			}
			
			tiqueTaque.tique(false);
		} else {
			
			for (int i = 0; i < NUM; i++) {
				tiqueTaque.taque(true);
			}
			
			tiqueTaque.taque(false);
		}

	}
}