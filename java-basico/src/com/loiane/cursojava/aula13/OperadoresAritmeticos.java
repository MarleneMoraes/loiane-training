package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		/*
		 * Valores iguais ao resultado + 1:
		 * resultado++;
		 * resultado += 1;
		 */
		
		//Muito utilizado no dia-a-dia
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++); //imprimir o resultado e soma mais 1
		System.out.println(++resultado); //soma mais 1 e depois imprime o resultado
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--); //imprimir o resultado e diminui mais 1
		System.out.println(--resultado); //diminui mais 1 e depois imprime o resultado
		
		

	}

}
