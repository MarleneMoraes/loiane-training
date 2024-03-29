package com.loiane.estruturadados.aula024;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 24 - Filas com prioridade
 *
 */

public class Aula24 {
	public static void main(String[] args) {
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

		fila.enfileira(new Paciente("A", 2));
		fila.enfileira(new Paciente("C", 1));
		fila.enfileira(new Paciente("B", 3));

		System.out.println(fila);

		System.out.println(fila.desenfileira());

		System.out.println(fila);
	}
}
