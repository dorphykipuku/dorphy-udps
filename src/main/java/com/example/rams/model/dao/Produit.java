package com.example.rams.model.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prod")
public class Produit implements Serializable {
    @Serial
    private static final long serialVersionUID = 1905122041950251201L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prodid")
    private Long id;
    @Column(name = "prodnom")
    private String nom;
    @Column(name = "prodprix")
    private double prix;

    @ManyToOne
    @JoinColumn(name = "prodcat")
    private Categorie categorie;


}
