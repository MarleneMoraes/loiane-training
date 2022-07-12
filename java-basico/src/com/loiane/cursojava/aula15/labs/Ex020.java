/*
 * Faça um Programa que faça 5 perguntas para uma pessoa sobre um crime.
 * As perguntas são:
 * 
 * 	a. "Telefonou para a vítima?"
 *  b. "Esteve no local do crime?"
 *  c. "Mora perto da vítima?"
 *  d. "Devia para a vítima?"
 *  e. "Já trabalhou com a vítima?"
 *  
 *  O programa deve no final emitir uma classificação sobre a participação 
 *  da pessoa no crime. Se a pessoa responder positivamente a 2 questões, 
 *  ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
 *  e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 *  
 */

/**
 * @author Marlene
 * @since 2022-02-09
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("POLÍCIA DO CRIME");
		System.out.println("Responda as perguntas com s para sim e n para não.");
		int respS = 0, respN = 0;
		
		System.out.print("Telefonou para a vítima?");
		char resposta = scan.next().charAt(0);
		
		if (resposta == 's') {
			respS++;
		} else if (resposta == 'n') {
			respN++;
		}
		
		System.out.print("Esteve no local do crime?");
		resposta = scan.next().charAt(0);
		
		if (resposta == 's') {
			respS++;
		} else if (resposta == 'n') {
			respN++;
		}
		
		System.out.print("Esteve no local do crime?");
		resposta = scan.next().charAt(0);
		
		if (resposta == 's') {
			respS++;
		} else if (resposta == 'n') {
			respN++;
		}
		
		System.out.print("Esteve no local do crime?");
		resposta = scan.next().charAt(0);
		
		if (resposta == 's') {
			respS++;
		} else if (resposta == 'n') {
			respN++;
		}
		
		System.out.print("Esteve no local do crime?");
		resposta = scan.next().charAt(0);
		
		if (resposta == 's') {
			respS++;
		} else if (resposta == 'n') {
			respN++;
		}
		
		if (respS == 2) {
			System.out.println("Suspeita");
		} else if (respS == 3 || respS == 4) {
			System.out.println("Cúmplice");
		} else if (respS == 5) {
			System.out.println("Assassino");			
		} else {
			System.out.println("Inocente");
		}
		
		scan.close();
	}

}
