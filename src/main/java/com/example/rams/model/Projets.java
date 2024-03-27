package com.example.rams.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String auteur;
    private String sexe;
    private String age;
    private String niveauEtude;
    private String domaine;
    private String province;
    private String telephone;
    private String observation;
    private String posteDesire;
    private String structureDesire;
    private String etatCivil;
    private String fonction;








}
