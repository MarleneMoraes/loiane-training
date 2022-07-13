package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-04
 * 
 *        18. Faça um programa que peça o tamanho de um arquivo para download
 *        (em MB e a velocidade de um link de Internet (em Mbps), calcule e
 *        informe o tempo aproximado de download do arquivo usando este link (em
 *        minutos).
 */

public class Ex018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double tamanhoArquivo, velocidadeInternet, tempoDownload;

		/*
		 * Mbps = Megabits por segundo 1 MB = 8 Mb
		 */

		System.out.println("CALCULADORA DE TEMPO DE DOWNLOAD");

		System.out.print("Digite o tamanho de um arquivo para download (em MB): ");
		tamanhoArquivo = scan.nextDouble();

		System.out.print("Digite a velocidade de um link de Internet (em Mbps): ");
		velocidadeInternet = scan.nextDouble();

		// Transformar Mbps em MBps
		velocidadeInternet /= 8;

		tempoDownload = tamanhoArquivo / velocidadeInternet;

		// Transformar segundos em minutos
		tempoDownload *= 60;

		System.out.printf("Tempo aproximado de download: %.2fmin", tempoDownload);

		scan.close();
	}

}