package com.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TEO_EMPRESAS database table.
 * 
 */
@Entity
@Table(name="TEO_EMPRESAS")
public class TeoEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TeoEmpresaPK id;

	@Column(name="CDTIPO_EMPRESA")
	private String cdtipoEmpresa;

	@Column(name="DSRAZON_SOCIAL")
	private String dsrazonSocial;

	//bi-directional many-to-one association to TeoUsuario
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CDNUMERO_DOCUMENTO_ADMIN", referencedColumnName="CDNUMERO_DOCUMENTO"),
		@JoinColumn(name="CDTIPO_DOCUMENTO_ADMIN", referencedColumnName="CDTIPO_DOCUMENTO")
		})
	private TeoUsuario teoUsuario;

	public TeoEmpresa() {
	}

	public TeoEmpresaPK getId() {
		return this.id;
	}

	public void setId(TeoEmpresaPK id) {
		this.id = id;
	}

	public String getCdtipoEmpresa() {
		return this.cdtipoEmpresa;
	}

	public void setCdtipoEmpresa(String cdtipoEmpresa) {
		this.cdtipoEmpresa = cdtipoEmpresa;
	}

	public String getDsrazonSocial() {
		return this.dsrazonSocial;
	}

	public void setDsrazonSocial(String dsrazonSocial) {
		this.dsrazonSocial = dsrazonSocial;
	}

	public TeoUsuario getTeoUsuario() {
		return this.teoUsuario;
	}

	public void setTeoUsuario(TeoUsuario teoUsuario) {
		this.teoUsuario = teoUsuario;
	}

}