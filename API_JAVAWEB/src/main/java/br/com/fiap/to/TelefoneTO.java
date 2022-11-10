package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TelefoneTO {
	private int idTelefone, idUsuario, nrDdi, nrDdd, nrTelefone;
	private String stTelefone;

	public TelefoneTO() {
		// TODO Auto-generated constructor stub
	}

	public TelefoneTO(int idTelefone, int idUsuario, int nrDdi, int nrDdd, int nrTelefone, String stTelefone) {
		super();
		this.idTelefone = idTelefone;
		this.idUsuario = idUsuario;
		this.nrDdi = nrDdi;
		this.nrDdd = nrDdd;
		this.nrTelefone = nrTelefone;
		this.stTelefone = stTelefone;
	}

	public int getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getNrDdi() {
		return nrDdi;
	}

	public void setNrDdi(int nrDdi) {
		this.nrDdi = nrDdi;
	}

	public int getNrDdd() {
		return nrDdd;
	}

	public void setNrDdd(int nrDdd) {
		this.nrDdd = nrDdd;
	}

	public int getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(int nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public String getStTelefone() {
		return stTelefone;
	}

	public void setStTelefone(String stTelefone) {
		this.stTelefone = stTelefone;
	}
	
	
	
}
