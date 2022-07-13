package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-07
 * 
 *        14. Faça um programa que lê as duas notas parciais obtidas por um
 *        aluno numa disciplina ao longo de um semestre, e calcule a sua média.
 *        A atribuição de conceitos obedece à tabela abaixo:
 * 
 *        Média de Aproveitamentp 			Conceito 
 *        Entre 9.0 e 10.0 						A 
 *        Entre 7.5 e 9.0 						B
 *        Entre 6.0 e 7.5 						C 
 *        Entre 4.0 e 6.0 						D 
 *        Entre 4.0 e zero 						E
 * 
 *        O algoritmo deve mostrar na tela as notas, a média, o conceito
 *        correspondente e a mensagem "APROVADO" se o conceito for A, B ou C, ou
 *        "REPROVADO" se o conceito for D ou E.
 */

public class Ex014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("BOLETIM ESCOLAR");
		System.out.print("Nota 1: ");
		double nota1 = scan.nextDouble();

		System.out.print("Nota 2: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 6.0 && media <= 10.0) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}

		scan.close();

	}

}
