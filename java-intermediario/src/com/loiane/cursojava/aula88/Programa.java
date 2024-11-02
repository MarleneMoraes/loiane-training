package com.loiane.cursojava.aula88;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Programa {

	public static void main(String[] args) {

		// Calendar e uma classe abstrata

		GregorianCalendar hoje = new GregorianCalendar(); 

		imprimirData(hoje);

		System.out.println(hoje.isLeapYear(2020)); // apenas na classe GregorianCalendar

		GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1);

		imprimirData(hoje2);

		GregorianCalendar hoje3 = new GregorianCalendar(2017, 0, 1, 14, 30, 23);

		imprimirData(hoje3);

	}

	private static void imprimirData(Calendar hoje) {

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.printf("Hoje � : %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);

		System.out.println();
	}
}
