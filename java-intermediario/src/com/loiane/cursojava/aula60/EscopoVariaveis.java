package com.loiane.cursojava.aula60;

public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaValor(int valor) {

        valor = valor + 10;

        // this.valor = valor; // referencial valor global/atributo da classe

        return valor;
    }

    public int escopoLocal() {

        int valor = 5;

        if (true) {

            valor--;
        }

        // this.valor = valor; // referencial valor global/atributo da classe

        return valor;
    }

    public void escopoFor() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // i++; //erro de compilação

        int j;
        for (j = 0; j < 10; j++) {
            System.out.println(j);
        }

        System.out.println(j); // 10
    }

    public void escopoIf() {

        boolean flag = true;

        if (flag) {

            int num = 10;

            num++;

            System.out.println(num);
        }

        // System.out.println(num); //erro de compilacao
    }

    public void escopoBlocoExceptions(int num) {

        int total = 0;

        try {
            int num_ = 0;

            total = num / num_;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            total++;
            // num_++; //erro de compilacao
            // e.printStackTrace(); //erro de compilacao
        }

        num++;

        // num_++; //erro de compilacao
        // e.printStackTrace(); //erro de compilacao
    }
}