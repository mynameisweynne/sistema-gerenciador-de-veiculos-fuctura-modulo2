package br.com.fuctura.entidade;

import java.util.Objects;

public class Tipo {

	private int codigo;
	private String descricao;

	public Tipo() {

	}

	public Tipo(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Tipo other = (Tipo) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Tipo [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
}
