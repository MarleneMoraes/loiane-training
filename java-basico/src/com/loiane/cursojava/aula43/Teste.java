package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		 
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas); 
		
		System.out.println(aluno); //imprime o nome do pacote seguido pela referência na memória (ponteiro)
		
		String s1 = "Marlene";
		String s2 = "MarlenE";
		 
		//System.out.println(s1 == s2);  //comparação de referência na memória
		System.out.println(s1.equals(s2)); //retornará falso devido o case sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); //retornará verdadeiro, pois ignorará o case sensitive
	
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Sistemas de Informação");
		double[] notas2 = {10, 9, 8, 7};
		aluno.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2)); //comparativo de atributos
		
		aluno2.setCurso("Ciência da Computação");
	}

}
