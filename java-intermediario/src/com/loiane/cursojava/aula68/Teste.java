package com.loiane.cursojava.aula68;

public class Teste {
    public static void main(String[] args) {

        // criacao de um processo neste programa

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
    }

}