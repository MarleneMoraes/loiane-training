// 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheint.

/**
 * @author Marlene
 * @since 2022-02-04
 */

package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double temperaturaFarenheit, temperaturaCelsius;
		
		System.out.println("CELSIUS EM FARENHEIT");
		
		System.out.print("Digite a temperatura em Celsius: ");
		temperaturaCelsius = scan.nextDouble();
		
		temperaturaFarenheit = ((temperaturaCelsius * 9) / 5) + 32 ;
		
		System.out.printf("Temperatura em Farenheit: %.1fºF", temperaturaFarenheit);
		scan.close();
	}

}
