package br.com.fuctura.dao;

import br.com.fuctura.entidade.Cliente;

public interface ClienteDAO {

	void inserir (Cliente obj);
	void deletar (int id);
}
