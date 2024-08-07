package br.com.fuctura.entidade;

import java.util.Objects;

public class Vendedor {

	private int codigo;
	private String nome;
	private Venda venda;

	public Vendedor() {
	}

	public Vendedor(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Vendedor(int codigo, String nome, Venda venda) {
		this.codigo = codigo;
		this.nome = nome;
		this.venda = venda;
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
	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
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
		Vendedor other = (Vendedor) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Vendedor [codigo=" + codigo + ", nome=" + nome + "]";
	}

}
