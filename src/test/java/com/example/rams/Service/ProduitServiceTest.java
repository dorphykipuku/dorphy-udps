package com.example.rams.Service;

import com.example.rams.Repository.CategorieRepository;
import com.example.rams.Repository.ProduitRepository;
import com.example.rams.model.dao.Categorie;
import com.example.rams.model.dao.Produit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class ProduitServiceTest {
    @Autowired
    private ProduitRepository repo;
    @Autowired
    private CategorieRepository repoCat;

    private CategorieService categorieService;
    private ProduitService service;
    @BeforeEach
    public void setUp(){
        service = new ProduitService(repo);
        categorieService = new CategorieService(repoCat);
    }


    @Test
    void findAllProduits() {

        Categorie categorie = new Categorie();
        categorie.setDescription("vetement");

        Categorie savedCategorie = repoCat.save(categorie);

        Produit produit = new Produit();
        produit.setCategorie(savedCategorie);
        produit.setPrix(2300);
        produit.setNom("pantalon");
        service.addProduit(produit);

        Iterable<Produit> produits = service.findAllProduits();
        Produit savedProduit = produits.iterator().next();

        assertThat(savedProduit).isNotNull();

    }

    @Test
    void removeProduit() {
    }

    @Test
    void addProduit() {
    }

    @Test
    void updateProduit() {
    }
}