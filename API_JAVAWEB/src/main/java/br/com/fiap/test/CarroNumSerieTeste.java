package br.com.fiap.test;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.CarroNumSerieDAO;
import br.com.fiap.to.CarroNumSerieTO;

public class CarroNumSerieTeste {

	public static void main(String[] args) throws SQLException {
		
		CarroNumSerieDAO cnsd = new CarroNumSerieDAO();
		
		// System.out.println("RESPOSTA: " + cnsd.searchDAO(2134).getDsQuilometragem());
		
		List<CarroNumSerieTO> lista = cnsd.searchDAO();
		
		String dados = "Lista de carros: \n\n";
		if (lista != null) {
			for (CarroNumSerieTO carroNumSerie : lista) {
				dados += "Número de série: " + carroNumSerie.getNrSerie() + "\n";
				dados += "Data de início: " + carroNumSerie.getDtInicio() + "\n";
			}
		}
		System.out.println("RESPOSTA: " + dados);
		
	}

}
