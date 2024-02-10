package com.loiane.cursojava.aula91;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(Locale.getDefault());

		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);

		Locale.setDefault(new Locale("pt", "Brazil")); // "pt", "BR"

		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado); // formatado para o padrao brasileiro

		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado); // dd/MMM/yyyy

		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado); // hh:mm

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado); // hh:mm:ss

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);// hh:mm:ss z

		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		// Transformar String em data 
		// OBS: atentar ao padrao da data

		String data = "12-02-2017 14:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);

			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate); // retorna do GregorianCalendar

			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
