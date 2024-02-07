package com.loiane.cursojava.aula66;

import com.loiane.cursojava.aula61.Contato;

public class ColetorLixo {
    // Garbage Collector - varre da memoria os objetos marcados que nao possuem mais
    // referencia
    // a memoria permanece otimizada - a partir do Java 5

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 1024; // bytes * 1024

        Runtime runtime = Runtime.getRuntime(); // padrao singleton - padrao de projeto utilizado para que tenha apenas
                                                // uma instancia do objeto para o projeto inteiro

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);

    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[10000000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato("Contato" + i, "1234-56789" + i, "contato" + i + "@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization(); // finalizacao do objeto

        Runtime.getRuntime().gc(); // forcando o garbage collector, mas nao e uma regra que o garbage collector
                                   // seja chamado

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();

        // utilizar a Java VisualVM
    }

}