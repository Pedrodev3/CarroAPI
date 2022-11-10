package br.com.fiap.resource;

import javax.ws.rs.PathParam; /**/

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.bo.CarroNumSerieBO;
import br.com.fiap.to.CarroNumSerieTO;


@Path("/buscar")
public class CarroNumSerieResource {

	private CarroNumSerieBO cnsb = new CarroNumSerieBO();

	// Validar / Busca / Post (Postman)
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CarroNumSerieTO consulta(@PathParam("id") int nrSerie) throws SQLException {

		return cnsb.validar(nrSerie);
	}

	// ValidarTodos / Busca / Post (Postman)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CarroNumSerieTO> consultarTodos() throws SQLException {

		return cnsb.validarTodos();
	}

}
