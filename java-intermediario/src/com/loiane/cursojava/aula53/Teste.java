package com.loiane.cursojava.aula53;

public class Teste {
    public static void main(String[] args) {
        usandoConstantes();

        usandoEnum();
    }

    private static void usandoConstantes() {
        int[] diasDaSemana = { 0, DiaSemanaConstantes.SEGUNDA, DiaSemanaConstantes.TERCA, DiaSemanaConstantes.QUARTA,
                DiaSemanaConstantes.QUINTA, DiaSemanaConstantes.SEXTA, DiaSemanaConstantes.SABADO,
                DiaSemanaConstantes.DOMINGO };

        System.out.println("Teste utilizando constantes no Java");
        for (int dia : diasDaSemana) {
            if (dia != 0) {
                imprimeDiaSemana(dia);
            }
        }
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terca-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    // Enum tem o controle de variaveis e leitura do codigo mais claro

    private static void usandoEnum() {
        DiaSemana[] semana = { DiaSemana.SEGUNDA, DiaSemana.TERCA, DiaSemana.QUARTA,
                                    DiaSemana.QUINTA, DiaSemana.SEXTA, DiaSemana.SABADO,
                                    DiaSemana.DOMINGO };

        System.out.println("Teste utilizando enum no Java");
        for (DiaSemana dia : semana) {
            
            imprimeDiaSemana(dia);
        }
    }

    private static void imprimeDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terca-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

   
}