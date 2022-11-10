package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioTO {
	
	private int idUsuario;
	private String nmCompleto;
	private String dsEmail;
	private String dsSenha;
	private String nrCpf;
	private int idTelefone, nrDdi, nrDdd, nrTelefone;
	private String stTelefone;

	public UsuarioTO() {
		// TODO Auto-generated constructor stub
	}

	
	public UsuarioTO(int idUsuario, String nmCompleto, String dsEmail, String dsSenha, String nrCpf, int idTelefone,
			int nrDdi, int nrDdd, int nrTelefone, String stTelefone) {
		super();
		this.idUsuario = idUsuario;
		this.nmCompleto = nmCompleto;
		this.dsEmail = dsEmail;
		this.dsSenha = dsSenha;
		this.nrCpf = nrCpf;
		this.idTelefone = idTelefone;
		this.nrDdi = nrDdi;
		this.nrDdd = nrDdd;
		this.nrTelefone = nrTelefone;
		this.stTelefone = stTelefone;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNmCompleto() {
		return nmCompleto;
	}


	public void setNmCompleto(String nmCompleto) {
		this.nmCompleto = nmCompleto;
	}


	public String getDsEmail() {
		return dsEmail;
	}


	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}


	public String getDsSenha() {
		return dsSenha;
	}


	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}


	public String getNrCpf() {
		return nrCpf;
	}


	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}


	public int getIdTelefone() {
		return idTelefone;
	}


	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
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
