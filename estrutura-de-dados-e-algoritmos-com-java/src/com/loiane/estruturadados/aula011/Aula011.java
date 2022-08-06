package com.loiane.estruturadados.aula011;

import com.loiane.estruturadados.aula010.Contato;

public class Aula011 {

	public static void main(String[] args) {
		/*
		 * VetorObjetos vetor = new VetorObjetos(2);
		 * 
		 * vetor.adiciona(1);
		 * vetor.adiciona("Elemento do tipo string");
		 * 
		 * System.out.println(vetor); //imprime ambos os elementos, mas quebra o conceito da Estrutura de Dados
		 */
	
		//Generics (tipos genericos) - adicionada no Java 5
		
		Lista<String> vetor = new Lista<String>(1);
		
		/*
		 * //A partir do Java 7 e permitido:
		 * 
		 * Lista<String> vetor = new Lista(1);
		 */
		
		vetor.adiciona("Elemento");
		
		System.out.println(vetor);
		
		Lista<Contato> contatos = new Lista<Contato>(1);
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		
		contatos.adiciona(c1);
		contatos.adiciona(c2);
		contatos.adiciona(c3);
		
		System.out.println(contatos);
	}
}
