package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.to.TelefoneTO;


public class TelefoneDAO implements IDAO {
	
	private Connection con = null;
	private TelefoneTO telefone = null;
	
	public TelefoneDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	
	/**
	 * Cadastro de informações do telefone.
	 * 
	 * @throws SQLException
	 */
	public String insert(Object obj) throws SQLException {
		
		telefone = (TelefoneTO) obj;
		
		String sql = "INSERT INTO T_GS_TELEFONE (ID_TELEFONE, NR_DDD, NR_DDI, NR_TELEFONE, ST_TELEFONE) "
				+ "VALUES (SQ_GS_USUARIO.CURRVAL, ?, ?, ?, ?)";

		PreparedStatement ps = null;

		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, telefone.getNrDdd());
			ps.setInt(2, telefone.getNrDdi());
			ps.setInt(3, telefone.getNrTelefone());
			ps.setString(4, telefone.getStTelefone());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}

		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ps.close();
			con.close();
		}
	}
	
	
	/**
	 * Atualização de informações do telefone a partir da chave primária
	 * da tabela (T_GS_TELEFONE) do banco de dados.
	 * @throws SQLException 
	 */
	public String update(Object obj) throws SQLException {
		
		telefone = (TelefoneTO) obj;
		
		String sql = "UPDATE T_GS_TELEFONE SET NR_DDD = ?, NR_DDI = ?, NR_TELEFONE = ?, ST_TELEFONE = ? WHERE ID_TELEFONE = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, telefone.getNrDdd());
			ps.setInt(2, telefone.getNrDdi());
			ps.setInt(3, telefone.getNrTelefone());
			ps.setString(4, telefone.getStTelefone());
			ps.setInt(5, telefone.getIdTelefone());
			
			if (ps.executeUpdate() > 0) {
				return "Atualizado com sucesso.\n" + "Conexão Fechada!";
			} else {
				return "Error ao alterar.\n" + "Conexão Fechada!";
			}
		} catch (Exception e) {
			return e.getMessage();
		} finally {
			ps.close();
			con.close();
		}
	}
	
	
	/**
	 * Método para deletar informações relacionadas ao telefone 
	 * a partir da chave primária da tabela (T_GS_EMPRESA) do banco de dados.
	 * @throws SQLException 
	 */
	public String delete(Integer id) throws SQLException {
		String sql = "DELETE FROM T_GS_TELEFONE WHERE ID_TELEFONE = ? ";

		PreparedStatement ps = null;

		try {
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);

			if (ps.executeUpdate() > 0) {
				return "Excluido com sucesso!\n" + "Conexão Fechada!";
			} else {
				return "Erro ao excluir!\n" + "Conexão Fechada!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ps.close();
			con.close();
		}
	}
	
	
	/**
	 * Seleção de informações do telefone a partir da chave primária
	 * da tabela (T_GS_TELEFONE) do banco de dados.
	 */
	public List<TelefoneTO> select(Integer id) throws SQLException {
		
		telefone = new TelefoneTO();
		
		String sql = "SELECT * FROM T_GS_TELEFONE"
				+ " WHERE ID_TELEFONE = ? ";

		List<TelefoneTO> resul = new ArrayList<TelefoneTO>();
		
		PreparedStatement ps = null;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				telefone.setIdTelefone(rs.getInt(1));
				telefone.setNrDdd(rs.getInt(2));
				telefone.setNrDdi(rs.getInt(3));
				telefone.setNrTelefone(rs.getInt(4));
				telefone.setStTelefone(rs.getString(5));
				resul.add(telefone);

				rs.close();
				return resul;
			} else {
				rs.close();
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			ps.close();
			con.close();
		}
	}
	
	
	/**
	 * Seleção das informações de todos os telefones cadastrados.
	 * @throws SQLException 
	 */
	public List<TelefoneTO> selectAll() throws SQLException {
		
		telefone = new TelefoneTO();
		
		String sql = "SELECT * FROM T_GS_TELEFONE";

		List<TelefoneTO> resul = new ArrayList<TelefoneTO>();
		PreparedStatement ps = null;

		try {

			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs != null) {
				while (rs.next()) { 
					telefone.setIdTelefone(rs.getInt(1));
					telefone.setNrDdd(rs.getInt(2));
					telefone.setNrDdi(rs.getInt(3));
					telefone.setNrTelefone(rs.getInt(4));
					telefone.setStTelefone(rs.getString(5));
					resul.add(telefone);
				}
				return resul;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			ps.close();
			con.close();
		}
	}
	
}