package com.loiane.cursojava.aula74;

public class Deadlock {

	public static void main(String[] args) {

		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (RECURSO1) {
					System.out.println("Thread #1: bloqueou recurso 1");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Thread #1: tentando o acesso ao recurso 2"); // bloqueio do Deadlock
					// para evitar Deadlocks, deve utilizar os metodos wait e notify para liberacao temporaria
					// e uso dos recursos

					synchronized (RECURSO2) {
						System.out.println("Thread #1: bloqueou recurso 2");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (RECURSO2) {
					System.out.println("Thread #2: bloqueou recurso 2");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Thread #2: tentando o acesso ao recurso 1");

					synchronized (RECURSO1) {
						System.out.println("Thread #2: bloqueou recurso 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}