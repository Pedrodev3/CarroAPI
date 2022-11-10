package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.AdminDAO;
import br.com.fiap.to.AdminTO;


public class AdminBO {

	private AdminDAO ad;
	
	
	public AdminTO validacao(AdminTO at) throws SQLException {
		ad = new AdminDAO();
		return ad.loginDAO(at);
	}
	
	
	public String cadastrar(AdminTO at) throws SQLException {

		ad = new AdminDAO();

		// Regras de negócio
		if (at != null) {
			return ad.insert(at);
		}
		return null;
	}
	
	
	public String atualizar(AdminTO at) throws SQLException {

		ad = new AdminDAO();

		// Regras de negócio
		return ad.update(at);
	}
	
	
	public String remover(Integer id) throws SQLException {

		ad = new AdminDAO();

		// Regras de negócio
		return ad.delete(id);
	}
	
	
	public List<AdminTO> listar(Integer id) throws SQLException {

		List<AdminTO> resultado = null;

		ad = new AdminDAO();

		// Regras de negócio
		if (id != null) {
			resultado = ad.select(id);
		}

		return resultado;
	}
	
	
	public List<AdminTO> listarTodos() throws SQLException {

		ad = new AdminDAO();

		// Regras de negócio
		return ad.selectAll();
	}
}
