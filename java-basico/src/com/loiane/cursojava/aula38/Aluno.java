package com.loiane.cursojava.aula38;

public class Aluno extends Pessoa {

	private String cursos;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String cursos, double[] notas) {
		super(nome, endereco, telefone, cpf);
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
		super.setCpf("123456789-10"); // referência a classe-mãe

		this.setCpf("123456789-10"); // referência a própria classe

	}

}
