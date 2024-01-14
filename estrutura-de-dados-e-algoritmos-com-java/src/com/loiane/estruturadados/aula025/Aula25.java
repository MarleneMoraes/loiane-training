package com.loiane.estruturadados.aula025;

import java.util.PriorityQueue;
import java.util.Queue;

import com.loiane.estruturadados.aula025.Paciente;

/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 25 - API Java: PriorityQueue
 *
 */

public class Aula25 {
	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		priorityQueue.add(2);
		priorityQueue.add(1);
		
		System.out.println(priorityQueue);
		
		
		/*
		 * Classes aninhadas
		 * 
		 * Queue<Paciente> filaPaciente = new PriorityQueue<>(
		 * new Comparator<Paciente>(){
		 * 		@Override
		 * 		public int compare(Paciente p1, Paciente p2) {
		 * 		// 
		 * 			if (this.prioridade > o.getPrioridade()) {
		 * 				return 1;
		 * 			} else if (this.prioridade < o.getPrioridade()) {
		 * 				return -1;
		 * 			}
		 * 			return 0;
				//
		 *			return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
		 * 		}
		 * }
		 * filaPaciente.add(new Paciente("A", 2));
		 * filaPaciente.add(new Paciente("C", 1));
		 * filaPaciente.add(new Paciente("B", 3));
		 * 
		 * System.out.println(priorityQueue);
		 */
		
		
	}
}
