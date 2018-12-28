package com.gestionProd.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gestionProd.demo.entity.Etudiant;
import com.gestionProd.demo.entity.Formation;
@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {
	public List<Formation> findByNomContains(String nom);

}
