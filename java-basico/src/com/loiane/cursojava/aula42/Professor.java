package com.loiane.cursojava.aula42;

public class Professor {
	private String departamento;
	private String nomeCurso;
	private double salario;

	public Professor() {
		//super();
	}

	public Professor(String nome, String endereco, String telefone, String cpf, String departamento, String nomeCurso,
			double salario) {
		//super(nome, endereco, telefone, cpf);
		this.departamento = departamento;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		//s += super.getEndereco();
		return s;
	}

	// @Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do professor: ");
		System.out.println(this.obterEtiquetaEndereco());

	}

}
