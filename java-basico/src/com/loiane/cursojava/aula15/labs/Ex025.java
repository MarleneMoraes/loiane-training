package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-09
 * 
 *        25. Faça um Programa que faça 5 perguntas para uma pessoa sobre um
 *        crime. As perguntas são:
 * 
 *        a. "Telefonou para a vítima?" 
 *        b. "Esteve no local do crime?" 
 *        c. "Mora perto da vítima?" 
 *        d. "Devia para a vítima?" 
 *        e. "Já trabalhou com a vítima?"
 * 
 *        O programa deve no final emitir uma classificação sobre a participação
 *        da pessoa no crime. Se a pessoa responder positivamente a 2 questões,
 *        ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
 *        e 5 como "Assassino". Caso contrário, ele será classificado como
 *        "Inocente".
 */

public class Ex025 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String[] perguntas = {"Telefonou para a vítima?",  "Esteve no local do crime?",  
				"Mora perto da vítima?", "Devia para a vítima?","Já trabalhou com a vítima?"};

		System.out.println("POLÍCIA DO CRIME");
		System.out.println("Responda as perguntas com s para sim e n para não.");
		int respS = 0;

		for(int i = 0; i < perguntas.length; i++) {
			System.out.print(perguntas[i]);
			
			char resposta = scan.next().charAt(0);

			if (resposta == 's' || resposta == 'S') 
				respS++;
			 
		}


		if (respS == 2) 
			System.out.println("Suspeita");
		else if (respS == 3 || respS == 4) 
			System.out.println("Cúmplice");
		else if (respS == 5) 
			System.out.println("Assassino");
		else 
			System.out.println("Inocente");
		

		scan.close();
	}

}
