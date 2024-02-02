package com.loiane.cursojava.aula56.labs;

public enum Operacao {
	SOMAR('+') {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},
	SUBTRAIR('-') {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	},
	MULTIPLICAR('*') {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	},
	DIVIDIR('/') {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	};

	private char simbolo;

	Operacao(char simbolo) {
		this.simbolo = simbolo;
	}

	public String toString() {
		return Character.toString(this.simbolo);
	}

	public abstract double executarOperacao(double x, double y);

}