package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MotorTO {
	
	private int idMotor;
	private int idInfoCarro;
	private int dsMotorVidaUtil;

	public MotorTO() {
		// TODO Auto-generated constructor stub
	}

	public MotorTO(int idMotor, int idInfoCarro, int dsMotorVidaUtil) {
		super();
		this.idMotor = idMotor;
		this.idInfoCarro = idInfoCarro;
		this.dsMotorVidaUtil = dsMotorVidaUtil;
	}

	public int getIdMotor() {
		return idMotor;
	}

	public void setIdMotor(int idMotor) {
		this.idMotor = idMotor;
	}

	public int getIdInfoCarro() {
		return idInfoCarro;
	}

	public void setIdInfoCarro(int idInfoCarro) {
		this.idInfoCarro = idInfoCarro;
	}

	public int getDsMotorVidaUtil() {
		return dsMotorVidaUtil;
	}

	public void setDsMotorVidaUtil(int dsMotorVidaUtil) {
		this.dsMotorVidaUtil = dsMotorVidaUtil;
	}
	
	

}
