package br.com.fuctura.entidade;

import java.util.Objects;

public class Veiculo {

	private int codigo;
	private String placa;
	private String modelo;
	private int ano;
	private double valor;
	private Tipo tipo;

	public Veiculo() {
	}
	
	public Veiculo(int codigo, String placa, String modelo, int ano, double valor) {
		this.codigo = codigo;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	public Veiculo(int codigo, String placa, String modelo, int ano, double valor, Tipo tipo) {
		this.codigo = codigo;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}	
	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
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
		Veiculo other = (Veiculo) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Veiculo [codigo=" + codigo + ", placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", valor="
				+ valor + ", tipo=" + tipo + "]";
	}

}
