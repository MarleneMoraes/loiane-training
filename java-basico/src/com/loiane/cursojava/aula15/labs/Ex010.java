package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-06
 * 
 *        10. Faça um Programa que pergunte em que turno você estuda. Peça para
 *        digitar M-Matutino ou V-Vespertino ou N-Noturno. Imprima a mensagem
 *        "Bom Dia!", "Boa Tarde!", "Boa Noite!" ou "Valor Inválido!", conforme
 *        o caso.
 */

public class Ex010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("TURNO QUE VOCÊ ESTUDA");

		System.out.print("Digite o turno que você estuda (M para Matutino, V para Vespertino ou N para Noturno): ");
		char turno = scan.next().charAt(0);

		if (turno == 'M' || turno == 'm') {
			System.out.println("Bom Dia!");
		} else if (turno == 'V' || turno == 'v') {
			System.out.println("Boa Tarde!");
		} else if (turno == 'N' || turno == 'n') {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido!");
		}

		scan.close();
	}
}
