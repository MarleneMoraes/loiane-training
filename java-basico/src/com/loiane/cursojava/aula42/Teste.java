package com.loiane.cursojava.aula42;

import com.loiane.cursojava.aula42.Aluno;
import com.loiane.cursojava.aula42.Pessoa;
import com.loiane.cursojava.aula42.Professor;

public class Teste {

	public static void main(String[] args) {
		 
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
	
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "ahuhauuah"; //como um m�todo final, esta linha dar� erro, pois n�o poder� realizar modifica��es 
		System.out.println(Constantes.URL_BLOG);

		//final para vari�veis
		final int TOTAL = 1;
		System.out.println(TOTAL);
	}

}
