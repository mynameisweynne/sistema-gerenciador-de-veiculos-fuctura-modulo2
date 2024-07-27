package br.com.fuctura.dao.factory;

import br.com.fuctura.dao.ClienteDAO;
import br.com.fuctura.dao.impl.ClienteDAOJDBC;
import br.com.fuctura.database.DB;

public class DAOFactory {

	public static ClienteDAO criarClienteDAO() {
		return new ClienteDAOJDBC(DB.getConnection());
	}

}
