package com.gestionProd.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.gestionProd.demo.entity.Etudiant;
import com.gestionProd.demo.entity.Formation;
import com.gestionProd.demo.repository.EtudiantRepository;
import com.gestionProd.demo.repository.FormationRepository;

@SpringBootApplication
public class GestionProd2Application implements CommandLineRunner {
	@Autowired
     private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(GestionProd2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class,Formation.class);
		// TODO Auto-generated method stub
	    Formation fr=new Formation();
	    fr.setNom("JAVA");
		fr.setPeriode(20);
		fr.setEtudiants(null);
	//	formationRepository.save(fr);
		  Etudiant etd=new Etudiant();
		  etd.setNom("Mohssine");
		  etd.setPrenom("Mohssine");
		  etd.setDateNaissance(new Date());
		  etd.setFormation(fr);
 //etudiantRepository.save(etd);
	}

}

