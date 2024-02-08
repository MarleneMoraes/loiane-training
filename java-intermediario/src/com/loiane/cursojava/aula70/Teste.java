package com.loiane.cursojava.aula70;

public class Teste {
    public static void main(String[] args) {

        Thread[] threads = startsThreads();

        threads[0].setPriority(5);
        threads[1].setPriority(3);
        threads[2].setPriority(1);

        // threads[0].setPriority(Thread.NORM_PRIORITY); // constantes

        for (Thread thread : threads) {
            thread.start();
        }
    }

    static Thread[] startsThreads() {
        MinhaThreadRunnable[] threadsRunnable = new MinhaThreadRunnable[3];
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threadsRunnable.length; i++) {
            threadsRunnable[i] = new MinhaThreadRunnable("#" + i, 500);
            threads[i] = new Thread(threadsRunnable[i]);
        }

        return threads;
    }

}