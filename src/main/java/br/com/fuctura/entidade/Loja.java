package br.com.fuctura.entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Loja {

	private int codigo;
	private String nome;
	private Endereco endereco;
	private List<Veiculo> veiculos = new ArrayList<>();

	public Loja() {
	}

	public Loja(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Loja(int codigo, String nome, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
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
		Loja other = (Loja) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Loja [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", veiculos=" + veiculos + "]";
	}

}
