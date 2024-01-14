package com.loiane.estruturadados.aula025;

public class Paciente implements Comparable <Paciente> {
	private String nome;
	private int prioridade;
	
	public Paciente() { }

	public Paciente(String nome, int prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	//Comparação da prioridade do Paciente
	@Override
	public int compareTo(Paciente o) {
		/*
		 * obj1 > obj2 retorna > 0 (1)
		 * obj2 > obj1 retorna < 0 (-1) 
		 */
		
		if (this.prioridade > o.getPrioridade()) {
			return 1;
		} else if (this.prioridade < o.getPrioridade()) {
			return -1;
		}
		
		return 0;
	}

}
