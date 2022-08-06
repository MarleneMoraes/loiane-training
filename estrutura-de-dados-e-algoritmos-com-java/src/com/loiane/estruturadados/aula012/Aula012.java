package com.loiane.estruturadados.aula012;
/**
 * @author Marlene
 * 
 * Estrutura de Dados com Java
 * Aula 12 - API Java: ArrayList
 *
 */
import java.util.ArrayList;

public class Aula012 {

	public static void main(String[] args) {
		
		// Pertence ao java.util
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// Adicionar
		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);
		
		//Adicionar em um index especifico
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//busca do elemento
		boolean existe = arrayList.contains("A");
		
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento nao existe no array");
		}
		
		// busca do index atraves do elemento
		int posicao = arrayList.indexOf("B");
		
		if (posicao > -1) {
			System.out.println("Elemento existe no array na posicao " + posicao);
		} else {
			System.out.println("Elemento nao existe no array na posicao " + posicao);
		}
		
		// busca por posicao
		System.out.println(arrayList.get(2));
		
		// metodo remover
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		// tamanho do Array
		System.out.println(arrayList.size());
		
		
	}
}
