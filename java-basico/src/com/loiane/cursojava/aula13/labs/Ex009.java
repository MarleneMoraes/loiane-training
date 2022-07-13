package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        9. Faça um Programa que peça a temperatura em graus Farenheit,
 *        transforme e mostre a temperatura em graus Celsius.
 */

public class Ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double temperaturaFarenheit, temperaturaCelsius;

		System.out.println("FARENHEIT EM CELSIUS");

		System.out.print("Digite a temperatura em Farenheit: ");
		temperaturaFarenheit = scan.nextDouble();

		temperaturaCelsius = (5 * (temperaturaFarenheit - 32) / 9);

		System.out.printf("Temperatura em Celsius: %.1fºC", temperaturaCelsius);
		scan.close();
	}

}
