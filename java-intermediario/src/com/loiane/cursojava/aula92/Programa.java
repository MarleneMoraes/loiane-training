package com.loiane.cursojava.aula92;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Programa {
	public static void main(String[] args) {

		/*
		 	TimeZone - classe que padroniza as datas do programa 
		 	para a internacionalizacao
		 */
		
		Calendar calendar = Calendar.getInstance();
		TimeZone timeZone = calendar.getTimeZone();

		System.out.println(timeZone); // EST - America/New York

		// Fusos Disponiveis no TimeZone
		String[] fusos = TimeZone.getAvailableIDs();
		for (String fuso : fusos) {
			System.out.println(fuso);
		}

		// Configurar o TimeZone
		TimeZone timeZoneSP = TimeZone.getTimeZone("America/Sao_Paulo");

		System.out.println(timeZoneSP.getDisplayName());
		System.out.println(timeZoneSP.getID());

		// Conversao de datas e salvar
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));

		Calendar agoraSP = Calendar.getInstance(timeZoneSP);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));

		// Importante configurar por completo, pois configurar apenas o TimeZone,
		// edita apenas o ID
		agoraSP.add(Calendar.HOUR_OF_DAY, timeZoneSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
		System.out.println(sdf.format(agoraSP.getTime()));
	}
}
