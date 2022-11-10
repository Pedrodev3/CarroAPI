package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BateriaTO {
	
	private int idBateria, idInfoCarro, nrBateriaCarga, dsBateriaVidaUtil;

	public BateriaTO() {
		// TODO Auto-generated constructor stub
	}

	public BateriaTO(int idBateria, int idInfoCarro, int nrBateriaCarga, int dsBateriaVidaUtil) {
		super();
		this.idBateria = idBateria;
		this.idInfoCarro = idInfoCarro;
		this.nrBateriaCarga = nrBateriaCarga;
		this.dsBateriaVidaUtil = dsBateriaVidaUtil;
	}

	public int getIdBateria() {
		return idBateria;
	}

	public void setIdBateria(int idBateria) {
		this.idBateria = idBateria;
	}

	public int getIdInfoCarro() {
		return idInfoCarro;
	}

	public void setIdInfoCarro(int idInfoCarro) {
		this.idInfoCarro = idInfoCarro;
	}

	public int getNrBateriaCarga() {
		return nrBateriaCarga;
	}

	public void setNrBateriaCarga(int nrBateriaCarga) {
		this.nrBateriaCarga = nrBateriaCarga;
	}

	public int getDsBateriaVidaUtil() {
		return dsBateriaVidaUtil;
	}

	public void setDsBateriaVidaUtil(int dsBateriaVidaUtil) {
		this.dsBateriaVidaUtil = dsBateriaVidaUtil;
	}

}
