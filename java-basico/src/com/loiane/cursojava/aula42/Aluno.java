package com.loiane.cursojava.aula42;

public class Aluno {

	private String cursos;
	private double[] notas;

	public Aluno() {
		//super();
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String cursos, double[] notas) {
		//super(nome, endereco, telefone, cpf);
		this.cursos = cursos;
		this.notas = notas;
	}

	public String getCurso() {
		return cursos;
	}

	public void setCurso(String curso) {
		this.cursos = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void setCpf() {
		//super.setCpf("123456789-10"); // refer�ncia a classe-m�e

		//this.setCpf("123456789-10"); // refer�ncia a pr�pria classe

	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Aluno: ";
		//s += super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endere�o do aluno: ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
