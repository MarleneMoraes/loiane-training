package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		//Mesmo valor do for each
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(notas[i]);
		}

		System.out.println("Usando o for each");
		
		/*
		 	Boas práticas: 
		 	- nome da entidade no singular para acessar um determinado valor do array 
			- nome no plural, para indicar o array 
		 */
		
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		//exemplo 02
		double[][] notasAlunos = new double[30][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 7;
		notasAlunos[2][3] = 9;
		
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.print(nota + " ");
			}
			
			System.out.println();
		}

	}

}
