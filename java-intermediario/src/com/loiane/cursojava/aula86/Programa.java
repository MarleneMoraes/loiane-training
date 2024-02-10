package com.loiane.cursojava.aula86;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje); // DIADASEMANA MES DIA HORARIO FUSO ANO
		
		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
		
		System.out.println(hoje.getDate()); // Deprecated

	}
}
