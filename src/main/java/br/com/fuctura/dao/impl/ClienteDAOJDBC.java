package br.com.fuctura.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fuctura.dao.ClienteDAO;
import br.com.fuctura.database.DBException;
import br.com.fuctura.entidade.Cliente;

public class ClienteDAOJDBC implements ClienteDAO {

	private final Connection conn;

	public ClienteDAOJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(Cliente obj) {
		try (PreparedStatement pstmt = conn.prepareStatement(
				"INSERT INTO cliente" + "(nome, cpf, celular)" + "VALUES(?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

			pstmt.setString(1, obj.getNome());
			pstmt.setString(2, obj.getCpf());
			pstmt.setString(3, obj.getCelular());

			int linhasAfetadas = pstmt.executeUpdate();

			try (ResultSet rs = pstmt.getGeneratedKeys()) {
				if (linhasAfetadas > 0) {
					if (rs.next()) {
						obj.setCodigo(rs.getInt(1));
					}
				} else {
					throw new DBException("Inserção de cliente falhou!");
				}
			}

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
	}

	@Override
	public void deletar(int codigo) {
		try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM cliente WHERE codigo = ?")) {

			pstmt.setInt(1, codigo);

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected == 0) {
				throw new DBException("Nenhum usuário encontrado para exclusão. Verifique o CÓDIGO.");
			}

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
	}

}
