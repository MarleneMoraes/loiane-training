package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        20. Fa�a um Programa para a leitura de tr�s notas parciais de um
 *        aluno. O programa deve calcular a m�dia alcan�ada por aluno e
 *        apresentar: 
 *        - A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a 
 *        sete; 
 *        - A mensagem "Reprovado", se a m�dia alcan�ada for menor do que sete; 
 *        - A mensagem "Aprovado com Distin��o ", se a m�dia alcan�ada for igual 
 *        a 10;
 */

public class Ex020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double[] nota = new double[3];
		double mediaDoAluno = 0;

		System.out.println("SITUA��O ESCOLAR");

		for (int i = 0; i < nota.length; i++) {
			System.out.print("Digite sua nota: ");
			nota[i] = scan.nextDouble();
			mediaDoAluno += nota[i];
		}

		mediaDoAluno /= nota.length;

		if (mediaDoAluno == 10.0)
			System.out.println("Aprovado com Distin��o");
		else if (mediaDoAluno >= 7.0)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");

		scan.close();
	}
}
