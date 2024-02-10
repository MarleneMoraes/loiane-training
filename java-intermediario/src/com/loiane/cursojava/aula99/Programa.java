package com.loiane.cursojava.aula99;

import java.util.Random;

public class Programa {
	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 100)); // 0 a 100 + .0

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt()); // aleatorio inteiro que o Java consegue suportar

		System.out.println(aleatorio.nextInt(5 + 1)); // entre 0 a 5 (adiciona mais um para inclui-lo
	}
}
