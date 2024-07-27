package br.com.fuctura.dao;

import br.com.fuctura.entidade.Endereco;

public interface EnderecoDAO {

	void inserir (Endereco obj);
	void deletar (int id);
}
