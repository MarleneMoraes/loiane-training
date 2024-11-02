package com.loiane.cursojava.aula87;

import java.util.Calendar;

public class Programa {
	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // padrao singleton: nao instanciamos Calendar

		// Saida mais amigavel deve obter infos separadamente
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH); // Calendar.JANUARY;
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		// int hora = hoje.get(Calendar.HOUR); // 12hs
		int hora = hoje.get(Calendar.HOUR_OF_DAY); // 24hs
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
						  dia, (mes + 1), ano, hora, minutos, segundos);

		hoje.add(Calendar.DAY_OF_MONTH, -1); // diminuir dias (dias anteriores)

		hoje.add(Calendar.DAY_OF_MONTH, 6);

		System.out.println();

		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

	}
}
