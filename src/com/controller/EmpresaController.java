package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.entities.TeoEmpresa;
import com.model.entities.TeoEmpresaPK;
import com.model.entities.TeoUsuario;
import com.model.entities.TeoUsuarioPK;

public class EmpresaController {

	EntityManagerFactory emf ;
	EntityManager em;

	public EmpresaController(){

		emf = Persistence.createEntityManagerFactory("JSF_JPA");
		em = emf.createEntityManager();

	}

	public String newEmpresa(String tipoDoc, String numDoc, String razonSocial,
			String tipoEmpresa, String tipoDocAdmin, String numDocAdmin) throws Exception {
		TeoUsuario usuario = getUsuario(tipoDocAdmin, numDocAdmin);
		
		if (usuario == null)
			throw new Exception("Admin not found");	

		
		TeoEmpresa empresa = new TeoEmpresa();
		empresa.setCdtipoEmpresa(tipoEmpresa);
		empresa.setDsrazonSocial(razonSocial);
		empresa.setId(new TeoEmpresaPK(tipoDoc,numDoc));
		empresa.setTeoUsuario(usuario);
		
		//System.out.println(empresa.getId().getCdtipoDocumento());

		try {

			em.getTransaction().begin();
			em.persist(empresa);
			em.getTransaction().commit();
			return "success";

		} catch (Exception e) {
			return e.getMessage().toString();
		}finally{
			em.close();
		}
	}

	public TeoUsuario getUsuario(String tipoDocAdmin, String numDocAdmin) throws Exception{

		TeoUsuarioPK  usuarioPk = new TeoUsuarioPK(tipoDocAdmin,numDocAdmin); 	
		TeoUsuario usuario = em.find(TeoUsuario.class, usuarioPk);

		return usuario;

	}

}
