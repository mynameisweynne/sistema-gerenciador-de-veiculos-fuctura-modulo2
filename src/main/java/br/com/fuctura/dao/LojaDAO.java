package br.com.fuctura.dao;

import br.com.fuctura.entidade.Loja;

public interface LojaDAO {

	void inserir (Loja obj);
	void deletar (int id);
}
