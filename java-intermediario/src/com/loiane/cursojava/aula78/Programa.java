package com.loiane.cursojava.aula78;

public class Programa {
	public static void main(String[] args) {

		String ola = "Ol�";
		String ola2 = "OL�";
		String ola3 = "Ol�";
		String ola4 = new String(ola);

		// Metodo equals
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); // false
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); // true

		// Metodo equalsIgnoreCase
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); // true

		// Comparacao de referencia de memoria
		System.out.println("ola == ola1 " + (ola == ola2)); // false
		System.out.println("ola == ola3 " + (ola == ola3)); // true

		System.out.println("ola == ola4 " + (ola == ola4)); // false
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); // true
		System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); // true

		String banana = "banana";
		String ana = "ana";
		String ban = "ban";

		// Comparativo de regioes da String
		System.out.println(banana.regionMatches(1, ana, 0, 3)); // a partir do caracter, valor, tamanho por offset
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

		// Metodos endsWith e starsWith
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));

		// Metodo compareTo  - muito utilizado para ordenacao de colecoes
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";

		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));

		// -1 quando a > b
		// 0 quando a == b
		// 1 ou >1 quando a<b
	}

}
