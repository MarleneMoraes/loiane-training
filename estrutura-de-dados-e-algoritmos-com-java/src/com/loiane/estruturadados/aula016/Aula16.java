package com.loiane.estruturadados.aula016;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 16 - Espiar/Verificar elemento do topo (break)
 *
 */

public class Aula16 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.topo()); //null
		
		pilha.empilha(1);
		pilha.empilha(2);
		
		System.out.println(pilha.topo()); //2
		
		System.out.println(pilha);
	}
}
