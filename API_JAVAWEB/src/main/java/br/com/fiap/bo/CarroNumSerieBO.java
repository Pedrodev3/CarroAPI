package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.CarroNumSerieDAO;
import br.com.fiap.to.CarroNumSerieTO;


public class CarroNumSerieBO {
	
	private CarroNumSerieDAO cnsd;
	
	
	public CarroNumSerieTO validar(int nrSerie) throws SQLException {
		
		cnsd = new CarroNumSerieDAO();
		
		// Regras de negócio
		return cnsd.searchDAO(nrSerie);
	}
	
	
	public List<CarroNumSerieTO> validarTodos() throws SQLException {
		
		cnsd = new CarroNumSerieDAO();
		
		// Regras de negócio
		return cnsd.searchDAO();
	}
	
}
