package br.com.fuctura.dao;

import br.com.fuctura.entidade.Venda;

public interface VendaDAO {

	void inserir (Venda obj);
	void deletar (int id);
}
