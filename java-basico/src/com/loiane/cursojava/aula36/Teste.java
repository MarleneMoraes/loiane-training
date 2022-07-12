package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//criar objeto endereço (contato tem um endereço)
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("99");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("99999-999");
		
		contato.setEndereco(end);
		
		//objeto telefone (contato tem muitos telefones)
		Telefone tel = new Telefone();
		tel.setTipo("celular");
		tel.setDdd("11");
		tel.setNumero("99999-9999");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("residencial");
		tel2.setDdd("11");
		tel2.setNumero("2222-2222");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		
		//Teste saída no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getCidade()); //código perigoso: null pointer exception
		//System.out.println(contato.getTelefone());
		
		
		//verificação de não-nulo
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		//Arrays faz uma estrutura de repetição
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
