// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

/**
 * @author Marlene
 * @since 2022-02-03
 */

package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double area, lado;
		
		System.out.println("DOBRO DA ÁREA DO QUADRADO");
		
		System.out.print("Digite o valor do lado: ");
		lado = scan.nextDouble();
		
		area = Math.pow(lado, 2);
		
		area *= 2;
		
		System.out.printf("Dobro da área: %.2f", area);
		scan.close();
	}

}
