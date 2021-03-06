package com.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TEO_EMPRESAS database table.
 * 
 */
@Embeddable
public class TeoEmpresaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CDTIPO_DOCUMENTO")
	private String cdtipoDocumento;

	@Column(name="CDNUMERO_DOCUMENTO")
	private String cdnumeroDocumento;

	public TeoEmpresaPK() {
	}
	public TeoEmpresaPK(String tipoDoc, String numDoc) {
		cdtipoDocumento = tipoDoc;
		cdnumeroDocumento = numDoc;
	}
	public String getCdtipoDocumento() {
		return this.cdtipoDocumento;
	}
	public void setCdtipoDocumento(String cdtipoDocumento) {
		this.cdtipoDocumento = cdtipoDocumento;
	}
	public String getCdnumeroDocumento() {
		return this.cdnumeroDocumento;
	}
	public void setCdnumeroDocumento(String cdnumeroDocumento) {
		this.cdnumeroDocumento = cdnumeroDocumento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TeoEmpresaPK)) {
			return false;
		}
		TeoEmpresaPK castOther = (TeoEmpresaPK)other;
		return 
			this.cdtipoDocumento.equals(castOther.cdtipoDocumento)
			&& this.cdnumeroDocumento.equals(castOther.cdnumeroDocumento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cdtipoDocumento.hashCode();
		hash = hash * prime + this.cdnumeroDocumento.hashCode();
		
		return hash;
	}
}