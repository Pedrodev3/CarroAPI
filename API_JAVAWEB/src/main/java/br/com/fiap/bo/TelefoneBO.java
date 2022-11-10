package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.TelefoneDAO;
import br.com.fiap.to.TelefoneTO;


public class TelefoneBO {
	
	private TelefoneDAO td;
	
	public String cadastrar(TelefoneTO tt) throws SQLException {

		td = new TelefoneDAO();

		// Regras de negócio
		if (tt != null) {
			return td.insert(tt);
		}
		return null;
	}
	
	
	public void atualizar(TelefoneTO tt) throws SQLException {

		td = new TelefoneDAO();

		// Regras de negócio
		td.update(tt);
	}
	
	
	public void remover(Integer id) throws SQLException {

		td = new TelefoneDAO();

		// Regras de negócio
		td.delete(id);
	}
	
	
	public List<TelefoneTO> listar(Integer id) throws SQLException {

		List<TelefoneTO> resultado = null;

		td = new TelefoneDAO();

		// Regras de negócio
		if (id != null) {
			resultado = td.select(id);
		}

		return resultado;
	}
	
	
	public List<TelefoneTO> listarTodos() throws SQLException {

		td = new TelefoneDAO();

		// Regras de negócio
		return td.selectAll();
	}
	
}
