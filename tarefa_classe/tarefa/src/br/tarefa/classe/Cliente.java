package br.tarefa.classe;

import java.util.UUID;

public class Cliente {
	
	
	
	public UUID   codigo;
	public String nome;
	public int idade;
	public Sexo sexo;
	public String telefone;
	public String email;
	public Endereco endereco;

	
	public UUID getCodigo() {
		return codigo;
	}

	public void setCodigo() {
		this.codigo = UUID.randomUUID();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
