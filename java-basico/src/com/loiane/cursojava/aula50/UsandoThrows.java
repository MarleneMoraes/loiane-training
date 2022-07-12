package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {
	public static void main(String[] args) {
		
		System.out.print("Entre com um n�mero decimal: ");
		try {
			double numero = leNumero();
			System.out.println("Voc� digitou " + numero);
		} catch (Exception e) {
			System.out.println("Entrada Inv�lida");
			e.printStackTrace();
		}
		
	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		return numero;
	}
}
