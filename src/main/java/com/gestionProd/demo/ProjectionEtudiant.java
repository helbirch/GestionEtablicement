package com.gestionProd.demo;

import org.springframework.data.rest.core.config.Projection;

import com.gestionProd.demo.entity.Etudiant;

@Projection(name="p1",types = { Etudiant.class})
public interface ProjectionEtudiant {
	public String getNom();
}
