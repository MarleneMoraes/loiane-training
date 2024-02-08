package com.loiane.cursojava.aula67;

public class MinhaThread extends Thread {

    // Multitarefas -> processos e threads
    // processo - programa que esta sendo executado
    // thread - menor unidade de codigo que pode ser executada
    //      vantagem de programas mais eficientes
    //  Ciclo de Vida: New, Runnable, Waiting, Running, Dead
    
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start(); // inicia o metodo run
    }

    // classe run esta sendo sobrescrita para executar a thread
    public void run() { // executa a tarefa da thread

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " terminou a execução"); // estado dead
    }
}
