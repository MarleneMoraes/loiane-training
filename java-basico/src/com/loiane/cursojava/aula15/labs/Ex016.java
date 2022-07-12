/*
 * Faça um programa que calcule as raízes de uma equação do segundo grau, 
 * na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c 
 * e fazer as consistências, informando ao usuário nas seguintes situações:
 * 		a. Se o usuário informar o valor de A igual a zero, a equação não é 
 * 	do segundo grau e o programa não deve fazer pedir os demais valores, 
 * 	sendo encerrado.
 * 		b. Se o delta calculado for negativo, a equação não possui raízes 
 * 	reais. Informe ao usuário e encerre o programa; 
 * 		c. Se o delta calculado for igual a zero, a equação possui apenas 
 * 	uma raiz real; informe ao usuário;
 * 		d. Se o delta calculado for positivo, a equação possui duas raizes 
 * 	reais; informe-as ao usuário 
 */

/**
 * @author Marlene
 * @since 2022-02-07
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Insira o valor de a:");
		double a = scan.nextDouble();
		
		if (a != 0) {
			double delta = 0, x1, x2;

			System.out.print("Insira o valor de b:");
			double b = scan.nextDouble();
			
			System.out.print("Insira o valor de c:");
			double c = scan.nextDouble();
			
			delta = Math.pow (b, 2.0) - (4.0 * a * c);
			
			if (delta < 0) {
				System.out.print("A equação não possui raízes reais.");
			} else if (delta == 0){
				x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				
				System.out.printf("Raiz da equação %.2f", x1);
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
				
				System.out.printf("Raiz x1 da equação: %.1f\n", x1);
				System.out.printf("Raiz x2 da equação: %.1f\n", x2);
			}	
		} 
		
		scan.close();
	}

}
