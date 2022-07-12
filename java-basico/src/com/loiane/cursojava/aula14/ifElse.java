package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		/* IF
			if (idade >= 18) {
				System.out.println("É maior de idade");
			}
		*/ 
		
		
		//IF-ELSE
		if (idade >= 18) {
			System.out.println("É maior de idade");
		} else {
			System.out.println("Não é maior de idade");
		}
		
		
		//Múltiplos IF-ELSE
		System.out.println("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto...");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Você pode pesquisar mais...");
		} else { //valor >= 17
			System.out.println("Está muito caro!");
		}

	}

}
