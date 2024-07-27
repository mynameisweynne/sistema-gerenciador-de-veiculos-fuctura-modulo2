package br.com.fuctura.entidade;

import java.util.Objects;

public class Endereco {

	private int codigo;
	private String cep;
	private String logradouro;
	private String complemento;
	private int numero;
	private Loja loja;
	private Cliente cliente;

	public Endereco() {
	}

	public Endereco(int codigo, String cep, String logradouro, String complemento, int numero) {
		this.codigo = codigo;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
	}

	public Endereco(int codigo, String cep, String logradouro, String complemento, int numero, Loja loja, Cliente cliente) {
		this.codigo = codigo;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.loja = loja;
		this.cliente = cliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		Endereco other = (Endereco) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Endereco [codigo=" + codigo + ", cep=" + cep + ", logradouro=" + logradouro + ", complemento="
				+ complemento + ", numero=" + numero + ", loja=" + loja + ", cliente=" + cliente + "]";
	}

}
