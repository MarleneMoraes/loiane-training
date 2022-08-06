package com.loiane.estruturadados.aula005;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 05 - Obter elemento de uma posição
 *
 */

import com.loiane.estruturadados.classesbase.Vetor;

public class Aula005 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			
			//Lancara a Excecao
			System.out.println(vetor.busca(-1));
			System.out.println(vetor.busca(15));
			
			//Retorna o valor do elemento
			System.out.println(vetor.busca(0));
			System.out.println(vetor.busca(1));
			
	}

}
