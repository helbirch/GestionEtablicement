package com.gestionProd.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data

public class Etudiant {
	@Id
	@GeneratedValue
private Long id;
private String nom;
private String prenom;
private Date dateNaissance;
@ManyToOne
private Formation formation;
}
