package br.com.fuctura.entidade;

public class Venda {

	private double valor;
	private Cliente cliente;
	private Loja loja;
	private Vendedor vendedor;
	
	public Venda() {
	}

	public Venda(double valor) {
		this.valor = valor;
	}
	
	public Venda(double valor, Cliente cliente, Loja loja, Vendedor vendedor) {
		this.valor = valor;
		this.cliente = cliente;
		this.loja = loja;
		this.vendedor = vendedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Vendas [valor=" + valor + ", cliente=" + cliente + ", loja=" + loja + ", vendedor=" + vendedor + "]";
	}
		
}
