package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula54.DiaSemana;

public class TesteEnum {

    public static void main(String[] args) {
        // Values - armazena todos os valores do enum

        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia : dias) {
            System.out.println(dia);
        }

        // Value of - atribui um valor para o enum 

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO")); // DOMINGO
    }
}