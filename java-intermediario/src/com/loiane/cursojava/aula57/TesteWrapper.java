package com.loiane.cursojava.aula57;

public class TesteWrapper {
    public static void main(String[] args) {

        // Java nao e 100 por cento orientada a objetos por
        // haver tipos primitivos (nao apenas a classe representando
        // os valores)

        // numeros inteiros
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        

        // pontos flutuantes
        float num5 = 3.5f;
        double num6 = 3.55555;

        // boleano
        boolean flag = true;

        // caracter 
        char a = 'a';

        // Classes Wrappers - classes empacotadoras do Java 
        Short num7 = new Short((short)1);
        Byte num8 = new Byte((byte)10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(10000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');


        Integer num13 = new Integer("100"); // caso tenha apenas numeros, a string sera transformada no valor correspondente
        
        Double num14 = new Double("3.5"); // 3,5 pt-BR

        // Transformacao de valores
        // ATENCAO: cuidado com o limite de valores de cada instancia para o Java nao transformar em um valor equivalente
        System.out.println(num13.intValue());
        System.out.println(num13.longValue()); 

        Long num15 = num13.longValue();

        int num16 = Integer.parseInt("100000");

        double num17 = Double.parseDouble("3.555");
        System.out.println(num17);

        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);

        // Comparacao com objetos deve ser feita com equals

        System.out.println(num9 == num13); // false
        System.out.println(num9.equals(num13)); // true 
    }
}