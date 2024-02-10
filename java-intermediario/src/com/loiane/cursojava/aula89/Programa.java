package com.loiane.cursojava.aula89;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Programa {
	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		// MM - 03
		// MMM - mar

		// hh - 12h
		// HH - 24h

		// a - am/pm

		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);

		System.out.println(dateFormat.format(data.getTime()));

		Date hoje = new Date();

		String d = dateFormat.format(hoje);
		System.out.println(d);

		
		// Transformacao de datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";

		try {
			Date minhaDataEmDate = sdf.parse(minhaData);

			System.out.println(minhaDataEmDate);

			System.out.println(dateFormat.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
