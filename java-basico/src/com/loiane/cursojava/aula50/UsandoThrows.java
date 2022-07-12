package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {
	public static void main(String[] args) {
		
		System.out.print("Entre com um número decimal: ");
		try {
			double numero = leNumero();
			System.out.println("Você digitou " + numero);
		} catch (Exception e) {
			System.out.println("Entrada Inválida");
			e.printStackTrace();
		}
		
	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		return numero;
	}
}
