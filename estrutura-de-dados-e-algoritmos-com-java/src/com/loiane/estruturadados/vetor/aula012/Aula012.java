package com.loiane.estruturadados.vetor.aula012;

import java.util.ArrayList;

public class Aula012 {

	public static void main(String[] args) {
		
		// API Java: ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// Adicionar
		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);
		
		//Adicionar em um index específico
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//busca do elemento
		boolean existe = arrayList.contains("A");
		
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		// busca do index através do elemento
		int posicao = arrayList.indexOf("B");
		
		if (posicao > -1) {
			System.out.println("Elemento existe no array na posição " + posicao);
		} else {
			System.out.println("Elemento não existe no array na posição " + posicao);
		}
		
		// busca por posição
		System.out.println(arrayList.get(2));
		
		// método remover
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		// tamanho do Array
		System.out.println(arrayList.size());
		
		
	}
}
