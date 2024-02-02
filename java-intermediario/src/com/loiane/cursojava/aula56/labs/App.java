package com.loiane.cursojava.aula56.labs;

public class App {
	public static void main(String[] args) {
		double x = 2.0;
		double y = 3.0;

		for (Operacao operacao : Operacao.values()) {
			System.out.println(x + " " + operacao.toString() + " " + y + " = " + operacao.executarOperacao(x, y));
		}

	}
}