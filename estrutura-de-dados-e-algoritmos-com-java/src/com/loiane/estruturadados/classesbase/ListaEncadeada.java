package com.loiane.estruturadados.classesbase;

public class ListaEncadeada<T> {

	private Celula<T> inicio;
	private Celula<T> ultimo;
	private int tamanho = 0;

	private final int NAO_ENCONTRADO = -1;
	private final String NAO_EXISTE = "Posicao invalida.";
	private final String LISTA_VAZIA = "Lista esta vazia.";

	public void adiciona(T elemento) {
		Celula<T> celula = new Celula<T>(elemento);

		if (this.tamanho == 0) {
            this.inicio = celula;
		} else {
			this.ultimo.setProximo(celula);
		}

		this.ultimo = celula;
		this.tamanho++;
	}
	
	public void adicionaInicio(T elemento) {
		if(this.tamanho == 0) {
			Celula<T> nova = new Celula<>(elemento);
			this.inicio = nova;
			this.ultimo = this.inicio;
		} else {
			Celula<T> nova = new Celula<>(elemento, this.inicio);
			this.inicio = nova;
		}
		
		this.tamanho++;
	}
	
	public void adiciona(int posicao, T elemento) {
		
		if(this.posicaoNaoExiste(posicao)) {
			throw new IllegalArgumentException(NAO_EXISTE);
		}
		
		if(posicao == 0) { // lista vazia
			this.adicionaInicio(elemento);
		} else if (posicao == this.tamanho) {  // adicionar na ultima
			this.adiciona(elemento);
		} else {
			Celula<T> anterior = this.buscaCelula(posicao);
			Celula<T> proximo = anterior.getProximo();
			Celula<T> nova = new Celula<>(elemento, proximo);
			anterior.setProximo(nova);
			
			this.tamanho++;
		}
	}
	
	public T removeInicio() {
		if(listaVazia()) {
			throw new RuntimeException(LISTA_VAZIA);
		}
		
		T removido = this.inicio.getElemento();
		this.inicio = this.inicio.getProximo();
		this.tamanho--;
		
		if(this.tamanho == 0) {
			this.ultimo = null;
		}
		
		return removido;
	}
	
	public T removeFinal() {
		if(listaVazia()) {
			throw new RuntimeException(LISTA_VAZIA);
		}
		
		if(this.tamanho == 1) {
			return this.removeInicio();
		}
		
		Celula<T> penultimo = this.buscaCelula(this.tamanho - 2);
		T removido = penultimo.getProximo().getElemento();
		
		penultimo.setProximo(null);
		
		this.ultimo = penultimo;
		this.tamanho--;
		
		return removido;
	}
	
	public T remove(int posicao) {
		if(this.posicaoNaoExiste(posicao)) {
			throw new RuntimeException(NAO_EXISTE);
		}
		
		if(posicao == 0) {
			return this.removeInicio();
		}
		
		if(posicao == this.tamanho - 1) {
			return this.removeFinal();
		}
		
		Celula<T> anterior = this.buscaCelula(posicao - 1);
		Celula<T> atual = anterior.getProximo();
		T removido = atual.getElemento();
		Celula<T> proximo = atual.getProximo();
		anterior.setProximo(proximo);
		atual.setProximo(null);
		this.tamanho--;
		
		return removido;
	}
	
	
	
	// Os getters e setters nao declarados sao com o intuito de
	// utilizacao interna da classe
	public int getTamanho() {
		return this.tamanho;
	}

	public void limpa() {
		for (Celula<T> atual = this.inicio; atual != null;) {
			Celula<T> proximo = atual.getProximo();
			atual.setElemento(null);
			atual.setProximo(null);
			atual = proximo;
		}
	}

	private Celula<T> buscaCelula(int posicao) {
		if (this.posicaoNaoExiste(posicao)) {
			throw new IllegalArgumentException(NAO_EXISTE);
		}

		Celula<T> atual = this.inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;
	}

	public T buscaPorPosicao(int posicao) {
		return this.buscaCelula(posicao).getElemento();
	}

	public int busca(T elemento) {
		Celula<T> atual = this.inicio;
		int posicao = 0;

		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return posicao;
			}

			posicao++;
			atual = atual.getProximo();
		}

		return NAO_ENCONTRADO;
	}

	private boolean posicaoNaoExiste(int posicao) {
		return !(posicao >= 0 && posicao <= this.tamanho);
	}
	
	private boolean listaVazia() {
		return this.tamanho == 0;
	}
	
	@Override
	public String toString() {
		if (this.tamanho == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		Celula<T> atual = this.inicio;

		for (int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getElemento()).append(",");
			atual = atual.getProximo();
		}

		builder.append(atual.getElemento());
		return builder.toString();
	}

}
