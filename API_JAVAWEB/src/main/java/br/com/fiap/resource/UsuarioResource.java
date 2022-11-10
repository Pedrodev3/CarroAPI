package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.PathParam; /**/
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.to.UsuarioTO;

@Path("/usuario")
public class UsuarioResource {

	private UsuarioBO ub = new UsuarioBO();

	
	// Validar / Login / Post (Postman)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response loginUsuario(UsuarioTO ut) throws SQLException {

		return Response.status(200).entity(ub.validacao(ut)).build();
	}

	
	// Cadastrar / Insert / Post (Postman)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(UsuarioTO ut, @Context UriInfo uriInfo) throws SQLException {
		// Cadastrando um novo recrutador
		ub.cadastrar(ut);

		// Construindo o PATH
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();

		// Parseando o código e concatenando com o PATH
		builder.path(Integer.toString(ut.getIdUsuario()));

		// Retornando o Status Code do HTTP através do Builder
		return Response.created(builder.build()).build();
	}

	
	// Atualizar / Update / Put (Postman)
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(UsuarioTO ut, @PathParam("id") int id) throws SQLException {

		// Setar o ID do registro do usuário
		ut.setIdUsuario(id);

		// Atualizando o objeto (registro do usuário)
		ub.atualizar(ut);

		// Retornando o Status 200
		return Response.ok().build();
	}

	
	// Excluir / Delete / Delete (Postman)
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) throws SQLException {
		ub.remover(id);
	}

	
	// Buscar / Select / GET-BY_ID (Postman)
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioTO> buscar(@PathParam("id") int id) throws SQLException {
		return ub.listar(id);
	}

	
	// BuscarTodos / SelectAll / GET-ALL (Postman)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioTO> buscarTodos() throws SQLException {
		return ub.listarTodos();
	}

}
