package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarroTO {
	
	private int idCarro;
	private int idEmpresa;
	private String nmMarca;
	private String nmModelo;
	private String nrPlaca;
	private String dtFabricacao;

	public CarroTO() {
		// TODO Auto-generated constructor stub
	}

	
	public CarroTO(int idCarro, int idEmpresa, String nmMarca, String nmModelo, String nrPlaca, String dtFabricacao) {
		super();
		this.idCarro = idCarro;
		this.idEmpresa = idEmpresa;
		this.nmMarca = nmMarca;
		this.nmModelo = nmModelo;
		this.nrPlaca = nrPlaca;
		this.dtFabricacao = dtFabricacao;
	}


	public int getIdCarro() {
		return idCarro;
	}


	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}


	public int getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getNmMarca() {
		return nmMarca;
	}


	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}


	public String getNmModelo() {
		return nmModelo;
	}


	public void setNmModelo(String nmModelo) {
		this.nmModelo = nmModelo;
	}


	public String getNrPlaca() {
		return nrPlaca;
	}


	public void setNrPlaca(String nrPlaca) {
		this.nrPlaca = nrPlaca;
	}


	public String getDtFabricacao() {
		return dtFabricacao;
	}


	public void setDtFabricacao(String dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}

}
