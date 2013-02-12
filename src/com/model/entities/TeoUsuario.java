package com.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TEO_USUARIOS database table.
 * 
 */
@Entity
@Table(name="TEO_USUARIOS")
public class TeoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TeoUsuarioPK id;

	private String dsapellidos;

	private String dsclave;

	private String dsnombres;

	//bi-directional many-to-one association to TeoEmpresa
	@OneToMany(mappedBy="teoUsuario")
	private List<TeoEmpresa> teoEmpresas;

	public TeoUsuario() {
	}

	public TeoUsuarioPK getId() {
		return this.id;
	}

	public void setId(TeoUsuarioPK id) {
		this.id = id;
	}

	public String getDsapellidos() {
		return this.dsapellidos;
	}

	public void setDsapellidos(String dsapellidos) {
		this.dsapellidos = dsapellidos;
	}

	public String getDsclave() {
		return this.dsclave;
	}

	public void setDsclave(String dsclave) {
		this.dsclave = dsclave;
	}

	public String getDsnombres() {
		return this.dsnombres;
	}

	public void setDsnombres(String dsnombres) {
		this.dsnombres = dsnombres;
	}

	public List<TeoEmpresa> getTeoEmpresas() {
		return this.teoEmpresas;
	}

	public void setTeoEmpresas(List<TeoEmpresa> teoEmpresas) {
		this.teoEmpresas = teoEmpresas;
	}

}