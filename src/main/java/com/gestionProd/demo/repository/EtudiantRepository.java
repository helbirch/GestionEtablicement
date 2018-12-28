package com.gestionProd.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gestionProd.demo.ProjectionEtudiant;
import com.gestionProd.demo.entity.Etudiant;
@RepositoryRestResource(excerptProjection=ProjectionEtudiant.class)
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
	public List<Etudiant> findByNomContains(String nom);
}
