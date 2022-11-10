package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class UsuarioBO {
	
	private UsuarioDAO ud;
	
	
	public UsuarioTO validacao(UsuarioTO ut) throws SQLException {
		ud = new UsuarioDAO();
		return ud.loginDAO(ut);
	}
	
	
	public String cadastrar(UsuarioTO ut) throws SQLException {

		ud = new UsuarioDAO();

		// Regras de negócio
		if (ut != null) {
			return ud.insert(ut);
		}
		return null;
	}
	
	
	public String atualizar(UsuarioTO ut) throws SQLException {

		ud = new UsuarioDAO();

		// Regras de negócio
		return ud.update(ut);
	}
	
	
	public String remover(Integer id) throws SQLException {

		ud = new UsuarioDAO();

		// Regras de negócio
		return ud.delete(id);
	}
	
	
	public List<UsuarioTO> listar(Integer id) throws SQLException {

		List<UsuarioTO> resultado = null;

		ud = new UsuarioDAO();

		// Regras de negócio
		if (id != null) {
			resultado = ud.select(id);
		}

		return resultado;
	}
	
	
	public List<UsuarioTO> listarTodos() throws SQLException {

		ud = new UsuarioDAO();

		// Regras de negócio
		return ud.selectAll();
	}
}
