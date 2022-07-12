/*
 *	Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 *	
 * */

/**
 * @author Marlene
 * @since 2022-02-06
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("VERIFICADOR DE VOGAL");
		
		System.out.print("Digite uma letra: ");
		char letra = scan.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' 
				|| letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.printf("A letra %c é uma vogal.", letra);	
		} else {
			System.out.printf("A letra %c é uma consoante.", letra);	
		}
		
		scan.close();
	}
}