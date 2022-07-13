package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-03
 * 
 * 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

public class Ex006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double raio, area;
		
		
		System.out.println("ÁREA DO CÍRCULO");
		
		System.out.print("Digite o raio: ");
		raio = scan.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("Área: %.2f", area);
		scan.close();
	}

}
