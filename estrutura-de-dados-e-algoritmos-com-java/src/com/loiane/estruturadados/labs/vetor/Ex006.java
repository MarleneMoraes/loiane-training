package com.loiane.estruturadados.labs.vetor;

/*
 * Exercício 06
 * Utilize a classe Lista ou Vetor e classe Contato 
 * (criada durante as aulas) e desenvolva os seguintes
 * itens:
 * 		1. Crie um vetor com capacidade para 20 contatos;
 * 		2. Insira 30 contatos no vetor (isso e possivel 
 * 		ser feito atraves de um loop);
 * 		3.Crie um exemplo para utilizar cada método da classe Lista;
 * */

public class Ex006 {
	public static void main(String[] args) {
		Lista<Contato> listaContatos = new Lista<Contato>(20);
		Contato contato;
		
		
		for (int i = 0; i < 30; i++) {
			contato = new Contato("Contato" + i, "1234-4567", "contato@email.com");
			listaContatos.adiciona(contato);	
		}	
		
		listaContatos.busca(6);
		//listaContatos.busca("Contato2");
		
		
	}
}
