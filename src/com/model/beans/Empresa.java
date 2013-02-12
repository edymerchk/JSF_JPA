package com.model.beans;

import com.controller.EmpresaController;

public class Empresa {

	private String tipoDoc;
	private String numDoc;
	private String razonSocial;
	private String tipoEmpresa;
	private String tipoDocAdmin;
	private String numDocAdmin;
	private String messagge;

	public String newEmpresa(){
		EmpresaController eCon = new EmpresaController();
		try {
			String result = eCon.newEmpresa(tipoDoc,numDoc,razonSocial,tipoEmpresa,tipoDocAdmin,numDocAdmin);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			messagge = e.getMessage().toString();
			return "fail";
		}

	}


	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public String getTipoDocAdmin() {
		return tipoDocAdmin;
	}
	public void setTipoDocAdmin(String tipoDocAdmin) {
		this.tipoDocAdmin = tipoDocAdmin;
	}
	public String getNumDocAdmin() {
		return numDocAdmin;
	}
	public void setNumDocAdmin(String numDocAdmin) {
		this.numDocAdmin = numDocAdmin;
	}
	public String getMessagge() {
		return messagge;
	}
	public void setMessagge(String messagge) {
		this.messagge = messagge;
	}

}
