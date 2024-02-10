package com.loiane.cursojava.aula80;

public class Programa {
	public static void main(String[] args) {

		String teste = "Isso é um teste.";

		System.out.println(teste);
		System.out.println(teste.substring(10)); // apenas informativo
		System.out.println(teste.substring(10, 15)); // o indice fim nao e inclusivo

		// Metodo concat - apenas concatenacao
		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); // ola + mundo
		System.out.println(olaMundo);

		// Metodo replace - substituir a primeira string pela nova
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);

		// Metodo replaceAll - substituir todas as strings pela nova
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);

		String nome = " meu nome é: ";
		System.out.println(nome);

		// Metodo trim - remove os espacos do inicio e do final
		System.out.println(nome.trim());

		// Conversar com sistemas e necessario saber manipulacao de strings
		// web services
		// XML
	}
}
