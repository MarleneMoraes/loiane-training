package com.loiane.cursojava.aula60;

public class Teste {

    public static void main(String[] args) {

        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor()); // 10

        System.out.println(escopo.calculaValor(20)); // 30

        System.out.println(escopo.getValor()); // 10

        System.out.println(escopo.escopoLocal()); // 4

        System.out.println(escopo.getValor());
    }
}