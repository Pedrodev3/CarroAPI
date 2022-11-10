package br.com.fiap.dao;

import java.sql.SQLException;

public interface IDAO {
	public String insert(Object obj) throws SQLException;

	public String update(Object obj) throws SQLException;

	public String delete(Integer id) throws SQLException;

	// Método "select" e "selectAll" estão sendo feitos nas ClasseDAO
}
