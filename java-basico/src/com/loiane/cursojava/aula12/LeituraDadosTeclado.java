package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * System.out.println("Digite seu nome completo: ");
		 * String nomeCompleto = scan.nextLine(); //ler a linha inteira
		 * System.out.println("Seu nome completo �: " + nomeCompleto);
		 * 
		 * System.out.println("Digite seu primeiro nome: ");
		 * String primeiroNome = scan.next(); //ler apenas a primeira palavra
		 * System.out.println("Seu primeiro nome �: " + nomeCompleto);
		
		 * System.out.println("Digite sua idade: ");
		 * int idade = scan.nextInt(); //ler apenas n�meros inteiros
		 * System.out.println("Sua idade �: " + idade);
					
		 * System.out.println("Digite sua altura: ");
		 * int altura = scan.nextInt(); //ler n�meros
		 * System.out.println("Sua altura �: " + altura);
			
		*/
		
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estima��o: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
	
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estima��o? " + temPet);
		
	}

}
