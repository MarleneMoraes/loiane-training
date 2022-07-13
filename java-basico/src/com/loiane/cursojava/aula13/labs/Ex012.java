package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        12. Tendo como dados de entrada a altura de uma pessoa, construa um
 *        algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 *        (72.7*altura)-58
 */

public class Ex012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double altura, pesoIdeal;

		System.out.println("PESO IDEAL");

		System.out.print("Digite a sua altura: ");
		altura = scan.nextDouble();

		pesoIdeal = (72.7 * altura) - 58;

		System.out.printf("Peso Ideal: %.2fkg", pesoIdeal);

		scan.close();
	}

}
