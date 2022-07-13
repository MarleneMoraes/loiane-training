package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-09
 * 
 *        15. Faça um Programa que peça os 3 lados de um triângulo. O programa
 *        deverá informar se os valores podem ser um triângulo, Indique, caso os
 *        lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
 *        escaleno. 
 *        Dicas: 
 *        - Três lados formam um triângulo quando a soma de quaisquer dos dois 
 *        lados for maior que o terceiro; 
 *        - Triângulo Equilátero: três lados iguais; 
 *        - Triângulo Isósceles: quaisquer dois lados iguais; 
 *        - Triângulo escaleno: três lados diferentes.
 */

public class Ex015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double[] lado = new double[3];

		System.out.println("TIPO DO TRIÂNGULO");

		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite o %dº lado: ", (i + 1));
			lado[i] = scan.nextDouble();
		}

		if (lado[0] == lado[1] && lado[1] == lado[2]) {
			System.out.println("Triângulo Equilátero");
		} else if (lado[0] == lado[1] && lado[1] != lado[2] || lado[0] != lado[1] && lado[1] == lado[2]
				|| lado[0] == lado[2] && lado[1] != lado[2]) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}

		scan.close();
	}

}
