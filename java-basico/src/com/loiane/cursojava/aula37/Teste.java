package com.loiane.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Maria");
		
		//professor.setTelefoneCelular(telefoneCelular);
		
		
		//Declarar a superclasse/classe-m�e/pai com a inst�ncia da sub-classe/classe-filha
		//Muito utilizado para polimorfismo
		
		Pessoa aluna = new Aluno(); //os m�todos de Aluno n�o aparecer�o para este objeto
		
		Pessoa professora = new Professor();
		
		
		
	}

}
