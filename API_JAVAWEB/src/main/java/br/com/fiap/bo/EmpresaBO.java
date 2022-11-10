package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.to.EmpresaTO;


public class EmpresaBO {

	private EmpresaDAO ed;
	
	
	public EmpresaTO validacao(EmpresaTO et) throws SQLException {
		ed = new EmpresaDAO();
		return ed.loginDAO(et);
	}
	
	
	public String cadastrar(EmpresaTO et) throws SQLException {

		ed = new EmpresaDAO();

		// Regras de negócio
		if (et != null) {
			return ed.insert(et);
		}
		return null;
	}
	
	
	public void atualizar(EmpresaTO et) throws SQLException {

		ed = new EmpresaDAO();

		// Regras de negócio
		ed.update(et);
	}
	
	
	public void remover(Integer id) throws SQLException {

		ed = new EmpresaDAO();

		// Regras de negócio
		ed.delete(id);
	}
	
	
	public List<EmpresaTO> listar(Integer id) throws SQLException {

		List<EmpresaTO> resultado = null;

		ed = new EmpresaDAO();

		// Regras de negócio
		if (id != null) {
			resultado = ed.select(id);
		}

		return resultado;
	}
	
	
	public List<EmpresaTO> listarTodos() throws SQLException {

		ed = new EmpresaDAO();

		// Regras de negócio
		return ed.selectAll();
	}
}