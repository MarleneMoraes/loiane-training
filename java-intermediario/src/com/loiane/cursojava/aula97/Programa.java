package com.loiane.cursojava.aula97;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		
		/*
		  DecimalFormat - classe filha da NumberFormet
		*/

		String padrao = "###,###.##"; // definicao do numero
		DecimalFormat df = new DecimalFormat(padrao);

		// df.applyPattern(padrao);
		System.out.println(df.format(1234567890.123));

		// Configurar para o padrao desejado
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');

		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(1234567890.123));

		// Criacao de agrupamento 
		String padrao3 = "###,###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(1234567890.123));

		
		// Obrigar o Java a adicionar 0 caso nao exista o valor
		String padrao4 = "\u00A4###,###,000.00%";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));
	}
}
