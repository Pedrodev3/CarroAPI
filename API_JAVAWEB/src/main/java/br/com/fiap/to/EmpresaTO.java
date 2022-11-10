package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmpresaTO {

	private int idEmpresa;
	private String nmEmpresa;
	private String nrCnpj;
	private String dsEmail;
	private String dsSenha;
	
	public EmpresaTO() {
		// TODO Auto-generated constructor stub
	}

	public EmpresaTO(int idEmpresa, String nmEmpresa, String nrCnpj, String dsEmail, String dsSenha) {
		super();
		this.idEmpresa = idEmpresa;
		this.nmEmpresa = nmEmpresa;
		this.nrCnpj = nrCnpj;
		this.dsEmail = dsEmail;
		this.dsSenha = dsSenha;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNmEmpresa() {
		return nmEmpresa;
	}

	public void setNmEmpresa(String nmEmpresa) {
		this.nmEmpresa = nmEmpresa;
	}

	public String getNrCnpj() {
		return nrCnpj;
	}

	public void setNrCnpj(String nrCnpj) {
		this.nrCnpj = nrCnpj;
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

	
}
