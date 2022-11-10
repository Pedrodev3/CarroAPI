package br.com.fiap.test;

import java.sql.SQLException;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class UsuarioTeste {

	public static void main(String[] args) throws SQLException {
		UsuarioTO ut = new UsuarioTO();
		ut.setNmCompleto("Luis Felipe");
		ut.setDsEmail("email");
		ut.setDsSenha("senha");
		ut.setNrCpf("35481584821");
		ut.setIdUsuario(43);

		UsuarioDAO ud = new UsuarioDAO();

		UsuarioBO ub = new UsuarioBO();

		System.out.println("RESPOSTA: " + ud.loginDAO(ut).getDsEmail());
//		System.out.println("RESPOSTA: " + ud.insert(ut));
//		System.out.println("RESPOSTA: " + ud.update(ut));
//		System.out.println("RESPOSTA: " + ud.delete(1));
//		System.out.println("RESPOSTA: " + ud.selectAll());
//		System.out.println("RESPOSTA: " + ud.select(1));
		
		
//		System.out.println("RESPOSTA: " + ub.validacao(ut));
//		System.out.println("RESPOSTA: " + ub.cadastrar(ut));
//		System.out.println("RESPOSTA: " + ub.atualizar(ut));
//		System.out.println("RESPOSTA: " + ub.remover(42));
//		System.out.println("RESPOSTA: " + ub.listar(43));
//		System.out.println("RESPOSTA: " + ub.listarTodos());

	}

}
