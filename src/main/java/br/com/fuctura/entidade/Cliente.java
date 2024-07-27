package br.com.fuctura.entidade;

import java.util.Objects;

public class Cliente {

	private int codigo;
	private String nome;
	private String cpf;
	private String celular;
	private Endereco endereco;

	public Cliente() {
	}

	public Cliente(int codigo, String nome, String cpf, String celular) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
	}
	
	
	public Cliente(int codigo, String nome, String cpf, String celular, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", celular=" + celular + ", endereco="
				+ endereco + "]";
	}

}
