package com.loiane.cursojava.aula58;

public class TesteAutoboxing {
    public static void main(String[] args) {

        // autoboxing - valores sendo representados em tipo primitivo
        // a partir do Java5
        Short num1 = 1;
        Byte num2 = 10;
        Integer num3 = 100;
        Long num4 = 10000l;
        Float num5 = 3.5f;
        Double num6 = 3.5555;
        Boolean flag = true;
        Character a_ = 'a';

        // auto unboxing - transformacao de um tipo objeto para um tipo primitivo
        int num7 = num3; // num.intValue();

        // autoboxing em expressoes
        num3++;
        System.out.println(num3);

        // auto unboxing num3 -> autoboxing num7/num3 -> num8
        Integer num8 = num7 / num3;

        // mau uso - muito manuseio dos numeros e recomendavel trabalhar com primitivos
        // caso seja necessario, transformar somente no final
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;

        Double media = (a + b + c) / 3;
        System.out.println(media);
    }
}