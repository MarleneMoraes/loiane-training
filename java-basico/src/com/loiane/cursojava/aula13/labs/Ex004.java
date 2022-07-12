//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média. 

/**
 * @author Marlene
 * @since 2022-02-03
 */

package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex004 {
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			double nota1, nota2, nota3, nota4, media;
			
			System.out.println("MÉDIA DO BIMESTRE");
			
			System.out.print("Digite a primeira nota: ");
			nota1 = scan.nextDouble();
			
			System.out.print("Digite a segunda nota: ");
			nota2 = scan.nextDouble();
			
			System.out.print("Digite a terceira nota: ");
			nota3 = scan.nextDouble();
			
			System.out.print("Digite a quarta nota: ");
			nota4 = scan.nextDouble();
			
			media = (nota1 + nota2 + nota3 + nota4)/4;
			
			System.out.printf("Média: %.2f", media);
			
			scan.close();
		}
	}
