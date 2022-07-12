package com.loiane.cursojava.aula42;

import com.loiane.cursojava.aula42.Aluno;
import com.loiane.cursojava.aula42.Pessoa;
import com.loiane.cursojava.aula42.Professor;

public class Teste {

	public static void main(String[] args) {
		 
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
	
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "ahuhauuah"; //como um método final, esta linha dará erro, pois não poderá realizar modificações 
		System.out.println(Constantes.URL_BLOG);

		//final para variáveis
		final int TOTAL = 1;
		System.out.println(TOTAL);
	}

}
