package com.loiane.cursojava.aula37;

public class Aluno extends Pessoa {
	
	private String cursos;
	private double[] notas;
	
	public Aluno() { }
	
	public Aluno(String nome, String endereco, String telefone, String cpf, String cursos, double[] notas) {
		super();
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
	
}
