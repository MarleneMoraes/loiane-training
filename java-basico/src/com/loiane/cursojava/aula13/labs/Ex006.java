package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 * 6. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
 */

public class Ex006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double raio, area;
		
		
		System.out.println("�REA DO C�RCULO");
		
		System.out.print("Digite o raio: ");
		raio = scan.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("�rea: %.2f", area);
		scan.close();
	}

}
