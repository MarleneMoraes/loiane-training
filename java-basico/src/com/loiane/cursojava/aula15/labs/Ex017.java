/*
 * Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano 
 * e em seguida informe se este ano � ou n�o bissexto.  
 */
/**
 * @author Marlene
 * @since 2022-02-09
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
   
		System.out.println("TIPO DE ANO");
		System.out.print("Ano: ");
		int ano = sc.nextInt();

		if (ano%4 == 0){
			if (ano%100 == 0) {
				System.out.println("Ano n�o-bissexto.");
			} else {
				System.out.println("Ano bissexto.");
			}

		} else {
			System.out.println("Ano n�o-bissexto.");			
		}

		sc.close();
	}

}
