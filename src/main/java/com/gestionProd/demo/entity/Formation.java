package com.gestionProd.demo.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Formation {
@Id
@GeneratedValue
private Long id;
private String nom;
private int periode;
@OneToMany(mappedBy="formation")
private Collection<Etudiant> etudiants;
}
