package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-09
 * 
 *        15. Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
 *        dever� informar se os valores podem ser um tri�ngulo, Indique, caso os
 *        lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
 *        escaleno. 
 *        Dicas: 
 *        - Tr�s lados formam um tri�ngulo quando a soma de quaisquer dos dois 
 *        lados for maior que o terceiro; 
 *        - Tri�ngulo Equil�tero: tr�s lados iguais; 
 *        - Tri�ngulo Is�sceles: quaisquer dois lados iguais; 
 *        - Tri�ngulo escaleno: tr�s lados diferentes.
 */

public class Ex015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double[] lado = new double[3];

		System.out.println("TIPO DO TRI�NGULO");

		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite o %d� lado: ", (i + 1));
			lado[i] = scan.nextDouble();
		}

		if (lado[0] == lado[1] && lado[1] == lado[2]) {
			System.out.println("Tri�ngulo Equil�tero");
		} else if (lado[0] == lado[1] && lado[1] != lado[2] || lado[0] != lado[1] && lado[1] == lado[2]
				|| lado[0] == lado[2] && lado[1] != lado[2]) {
			System.out.println("Tri�ngulo Is�sceles");
		} else {
			System.out.println("Tri�ngulo Escaleno");
		}

		scan.close();
	}

}
