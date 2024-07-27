package br.com.fuctura.dao;

import br.com.fuctura.entidade.Veiculo;

public interface VeiculoDAO {

	void inserir (Veiculo obj);
	void deletar (int id);
}
