// 7. Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.

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
		
		System.out.println("DOBRO DA �REA DO QUADRADO");
		
		System.out.print("Digite o valor do lado: ");
		lado = scan.nextDouble();
		
		area = Math.pow(lado, 2);
		
		area *= 2;
		
		System.out.printf("Dobro da �rea: %.2f", area);
		scan.close();
	}

}
