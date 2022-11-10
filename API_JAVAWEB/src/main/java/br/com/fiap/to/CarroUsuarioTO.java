package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarroUsuarioTO {
	private int idCarroUsuario, idCarro, idUsuario, nrSerie;
	private String dtInicio, dtFim;
	
	
	public CarroUsuarioTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CarroUsuarioTO(int idCarroUsuario, int idCarro, int idUsuario, int nrSerie, String dtInicio,
			String dtFim) {
		super();
		this.idCarroUsuario = idCarroUsuario;
		this.idCarro = idCarro;
		this.idUsuario = idUsuario;
		this.nrSerie = nrSerie;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	public int getIdCarroUsuario() {
		return idCarroUsuario;
	}

	public void setIdCarroUsuario(int idCarroUsuario) {
		this.idCarroUsuario = idCarroUsuario;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getNrSerie() {
		return nrSerie;
	}

	public void setNrSerie(int nrSerie) {
		this.nrSerie = nrSerie;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtFim() {
		return dtFim;
	}

	public void setDtFim(String dtFim) {
		this.dtFim = dtFim;
	}
	
}
