package com.loiane.cursojava.aula79;

public class Programa {
	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";

		// Metodo indexOf - indice de onde o char encontra ou -1
		System.out.println(banana.indexOf('x')); // -1
		System.out.println(banana.indexOf('b')); // 0
		System.out.println(banana.indexOf('a')); // 1

		System.out.println(banana.indexOf(ana)); // 1
		
		// Metodo lastIndexOf - indice da ultima vez que a string aparece ou -1 
		System.out.println(banana.lastIndexOf('a')); // 5
		System.out.println(banana.lastIndexOf(ana)); // 3

		// Metodo contains - contem determinada string ou -1
		System.out.println(banana.contains(ana)); // true
		System.out.println(banana.contains("ceu")); // false
	}
}
