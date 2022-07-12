package com.loiane.cursojava.aula45;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		//UPCASTING
		Pessoa pessoaAluna = aluno1; //conversão automática
		
		//Conversões manuais
		Pessoa aluno2 = new Aluno();
		Pessoa aluno3 = (Pessoa) new Aluno(); //muito comum, especialmente em código Hibernate
		
		
		//DOWNCASTING
		Object object1 = obterString();
		String string1 = (String) object1; //isso será possível pois o método que object1 foi atribuído retorna uma String
		
		Object object2  =  "minha String";
		String string2 = (String) object2; 
		
		/* 
			Falhas na execução (não referenciou o tipo em particular)
			Object object3  =  new Object;
			String string3 = (String) object3;
			
			Object object4  =  obterInteiro();
			String string4= (String) object;
		 */
		
		//instance of
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("é do tipo Pessoa");
		}
		
		if (aluno instanceof Aluno) {
			System.out.println("é do tipo Aluno");
		}
		
		if (professor instanceof Professor) {
			System.out.println("é do tipo Professor");
		}
	}
	
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}
	
	
	
	
}
