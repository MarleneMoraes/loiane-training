package com.loiane.cursojava.aula95;

import java.util.Locale;
import java.util.ResourceBundle;

public class Programa {
	public static void main(String[] args) {
		// Personalizacao para traduzir mensagens de acordo com a localizacao

		// System.out.println("Locale atual " + Locale.getDefault()); // caso o pc ja estiver US
		Locale.setDefault(Locale.US);
		ResourceBundle rb = ResourceBundle.getBundle("texto"); //  

		System.out.println("Hello EN: " + rb.getString("hello"));
		System.out.println("World EN: " + rb.getString("world"));

		// Locale.setDefault(new Locale("pt_BR", "pt_BR"));
		// Java localizara o pt_BR para passar a mensagem indicada
		rb = ResourceBundle.getBundle("texto", new Locale("pt_BR", "pt_BR"));

		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo pt_BR: " + rb.getString("world"));
	}

}
