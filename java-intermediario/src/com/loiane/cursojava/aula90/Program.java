package com.loiane.cursojava.aula90;

import java.text.NumberFormat;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {

		/*
		  Locale - utilizado para padronizar entradas e saidas de acordo com a localizacao,
		  para nao confundir o programador e o usuario final. 
		*/
		Locale locale = Locale.getDefault();

		System.out.println(locale);

		Locale[] locales = Locale.getAvailableLocales();
		
		for (Locale loc : locales) {

			System.out.println("Nome: " + loc.getDisplayName()); // locais disponiveis
			System.out.println("Código da língua: " + loc.getLanguage()); 
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cod País: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());

			System.out.println("*******************");

		}

		Locale br = new Locale("pt", "Brazil");

		System.out.println(br);

		Locale.setDefault(br); // padronizar o Locale do programa

		System.out.println(Locale.getDefault());

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d));

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d));

	}
}
