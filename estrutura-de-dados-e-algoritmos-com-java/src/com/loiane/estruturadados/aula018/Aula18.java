package com.loiane.estruturadados.aula018;

import java.util.Stack;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 18 - API Java: Stack
 *
 */

public class Aula18 {
	public static void main(String[] args) {
		//Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty()); //estaVazia()
		
		stack.push(1);//empilhar(1)
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty()); 
		System.out.println(stack.size());//tamanho()
		System.out.println(stack);
		
		
		//"peek", do inglês espiar
		System.out.println(stack.peek()); //topo() 
		
		System.out.println(stack.pop()); //desempilha()
		
		System.out.println(stack);
	}
}
