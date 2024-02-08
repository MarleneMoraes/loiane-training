package com.loiane.cursojava.aula68;

public class MinhaThreadRunnable implements Runnable {

    /*
     * OBS abordagem com a classe Runnable permite esta classe extender uma outra classe, ao inves da Thread
     * Ou seja, caso extenda a Thread, o Java nao permite extender mais outra classe
     */

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this); // o start nao funciona para Runnable: deve instanciar a classe Thread
        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }

}
