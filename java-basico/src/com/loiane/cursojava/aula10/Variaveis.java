package com.loiane.cursojava.aula10;

public class Variaveis {
	public static void main(String[] args) {
		
		//Convenção Java
		int idade = 20;
		String nome = "Loiane";
		String nomeDoMeuCachorro = "Tot�";
		String ano2014 = "2014";
		
		//Variáveis válidas, mas não utilizadas
		int _idade;
		int $idade;
		
		//Fora da convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro; // variável diferente da declarada acima, devido ao padrão CamelCase
	
		idade = 25;
				
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		
		//Más práticas: nomeação de variáveis com letras, pois não possuem significados
			int a = 10;
			String b = "Loiane";
		
	}
}
