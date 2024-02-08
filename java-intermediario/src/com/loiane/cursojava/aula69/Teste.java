package com.loiane.cursojava.aula69;

public class Teste {
    public static void main(String[] args) {

        Thread[] threads = startsThreads();

        // Teste 1 - nao funciona tao bem
        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado");

        // Teste 2 - dirty code
        while (threads[0].isAlive() || threads[1].isAlive() || threads[2].isAlive()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado");

        // Teste 3 - metodo join 

        try {
            threads[0].join();
            threads[1].join();
            threads[2].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }

    static Thread[] startsThreads() {
        MinhaThreadRunnable[] threadsRunnable = {
                new MinhaThreadRunnable("#1", 500),
                new MinhaThreadRunnable("#2", 500),
                new MinhaThreadRunnable("#3", 500)
        };

        Thread[] threads = new Thread[3];

        for (Thread thread : threads) {
            for (MinhaThreadRunnable threadRunnable : threadsRunnable) {
                thread = new Thread(threadRunnable);
            }
            thread.start();
        }

        return threads;
    }

}