package com.loiane.cursojava.aula71;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array) { // synchronized - permissao de acesso de uma thread por vez

        soma = 0;

        for (int i = 0; i < array.length; i++) {

            soma += array[i];

            // currentThread: acesso a thread atual
            System.out.println("Executando a soma " + Thread.currentThread().getName() +
                    " somando o valor " + array[i] + " com total de " + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        return soma;
    }
}
