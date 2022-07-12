/*
 *	Fa�a um Programa para a leitura de duas notas parciais de um aluno.
 *	O programa deve calcular a m�dia alcan�ada por aluno e apresentr:
 *	- A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
 *	- A mensagem "Reprovado", se a m�dia alcan�ada for menor do que sete;
 *	- A mensagem "Aprovado com Distin��o ", se a m�dia alcan�ada for igual a 10;
 *	
 * */

/**
 * @author Marlene
 * @since 2022-02-06
 */
package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("SITUA��O ESCOLAR");
		
		System.out.print("Digite sua nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a outra nota: ");
		double nota2 = scan.nextDouble();
		
		double mediaDoAluno = (nota1 + nota2) / 2;
		
		if (mediaDoAluno == 10.0) {
			System.out.println("Aprovado com Distin��o");
		} else if (mediaDoAluno >= 7.0) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		scan.close();
	}
}
