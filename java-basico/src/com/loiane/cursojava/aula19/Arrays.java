package com.loiane.cursojava.aula19;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		//...
		
		
		//Boas práticas com arrays: colocar os colchetes depois da declaração do tipo, para facilitar a leitura de outros programadores.
		double[] temperaturas = new double[365];
		
		//Uma maneira de inicializar uma variável de um array
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		//Propriendade length: tamanho total do array
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatuda do dia " + (i+1) + " é " + temperaturas[i]);
		}
		
		
		//for "melhorado": a partir da versão 5, cria-se uma variável e acessa cada espaço 
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
		//importante: o primeiro for é útil para acesso a POSIÇÃO e VALOR do array, enquanto o segundo, apenas o VALOR.
		
		
	}

}
