/*
 *	Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 *	Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 * */

/**
 * @author Marlene
 * @since 2022-02-06
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("VERIFICADOR DE SEXO");
		
		System.out.print("Digite seu sexo (F/M): ");
		char sexo = scan.next().charAt(0);
		
		if (sexo == 'F' || sexo == 'f') {
			System.out.println("Feminino");
		} else if (sexo == 'M' || sexo == 'm') {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		
		scan.close();
	}
}
