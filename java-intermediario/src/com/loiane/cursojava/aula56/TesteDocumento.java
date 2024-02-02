package com.loiane.cursojava.aula56;

public class TesteDocumento {
	public static void main(String[] args) {

		Pessoa pessoaFisica = new Pessoa();
		pessoaFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pessoaFisica.setNumeroDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaFisica);

		Pessoa pessoaJuridica = new Pessoa();
		pessoaJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaJuridica);
	}
}