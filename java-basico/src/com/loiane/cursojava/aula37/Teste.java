package com.loiane.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Maria");
		
		//professor.setTelefoneCelular(telefoneCelular);
		
		
		//Declarar a superclasse/classe-mãe/pai com a instância da sub-classe/classe-filha
		//Muito utilizado para polimorfismo
		
		Pessoa aluna = new Aluno(); //os métodos de Aluno não aparecerão para este objeto
		
		Pessoa professora = new Professor();
		
		
		
	}

}
