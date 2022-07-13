package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @since 2022-02-07
 * 
 *        28. O Hipermercado Tabajara está com uma promoção de carnes que é
 *        imperdível. Confira:
 * 
 *        				Até 5Kg 			Acima de 5Kg 
 *        Filé Duplo 	R$4,90 por Kg 		R$5,80 por Kg 
 *        Alcatra		R$5,90 por Kg 		R$6,80 por Kg 
 *        Picanha 		R$6,90 por Kg 		R$7,80 por Kg
 * 
 *        Para atender a todos os clientes, cada cliente poderá levar apenas um
 *        dos tipos de carne da promoção, porém não há limites para quantidade
 *        de carne por cliente. Se a compra for feita no cartão Tabajara, o
 *        cliente receberá ainda um desconto de 5% sobre o total da compra.
 * 
 *        Escreva um programa que peça o tipo e a quantidade de carne comprada
 *        pelo usuário e gere um cupom fiscal, contendo as informações da
 *        compra: tipo e quantidade de carne, preço total, tipo de pagamento,
 *        valor do desconto e valor a pagar.
 */

public class Ex028 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("HIPERMERCADO TABAJARA");
		double precoTotal = 0;
		double desconto = 0;
		double valorAPagar = 0;
		double quantidadeCarne = 0;

		System.out.print("Tipo da Carne \n(F - file duplo | A - alcatra | P - picanha: ");
		char tipoCarne = scan.next().charAt(0);

		if (tipoCarne == 'F' || tipoCarne == 'f') {
			System.out.print("Peso do file duplo: ");
			quantidadeCarne = scan.nextDouble();

			if (quantidadeCarne > 0.0 && quantidadeCarne <= 5.0) {
				precoTotal = 4.9 * quantidadeCarne;
			} else if (quantidadeCarne > 0.0 && quantidadeCarne > 5.0) {
				precoTotal = 5.8 * quantidadeCarne;
			} else {
				System.out.println("ERRO NO SISTEMA");
			}

		} else if (tipoCarne == 'A' || tipoCarne == 'a') {
			System.out.print("Peso do alcatra: ");
			quantidadeCarne = scan.nextDouble();

			if (quantidadeCarne > 0.0 && quantidadeCarne <= 5.0) {
				precoTotal = 5.9 * quantidadeCarne;
			} else if (quantidadeCarne > 0.0 && quantidadeCarne > 5.0) {
				precoTotal = 6.8 * quantidadeCarne;
			} else {
				System.out.println("ERRO NO SISTEMA");
			}
		} else if (tipoCarne == 'P' || tipoCarne == 'p') {
			System.out.print("Peso do picanha: ");
			quantidadeCarne = scan.nextDouble();

			if (quantidadeCarne > 0.0 && quantidadeCarne <= 5.0) {
				precoTotal = 6.9 * quantidadeCarne;
			} else if (quantidadeCarne > 0.0 && quantidadeCarne > 5.0) {
				precoTotal = 7.8 * quantidadeCarne;
			} else {
				System.out.println("ERRO NO SISTEMA");
			}
		}

		System.out.println("Tipo de compra (C - cartão/D - dinheiro)");
		char tipoPagamento = scan.next().charAt(0);

		if (tipoCarne == 'S' || tipoCarne == 's') {
			desconto = 5;
			valorAPagar = precoTotal - (precoTotal * (desconto / 100));
		} else {
			valorAPagar = precoTotal;

		}

		System.out.println("CUPOM FISCAL");
		System.out.printf("Tipo de carne %c\n", tipoCarne);
		System.out.printf("Quantiade de carne (em kg): %.1f\n", quantidadeCarne);
		System.out.printf("Preço total: R$%.2f\n", precoTotal);
		System.out.printf("Tipo de pagamento: %c\n", tipoPagamento);
		System.out.printf("Desconto: %d%%\n", desconto);
		System.out.printf("Valor a pagar: R$%.2f", valorAPagar);

		scan.close();

	}

}
