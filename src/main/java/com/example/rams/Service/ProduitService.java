package com.example.rams.Service;

import com.example.rams.Repository.ProduitRepository;
import com.example.rams.exceptions.NotFoundException;
import com.example.rams.model.dao.Produit;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {
    private final ProduitRepository repoProduit;

    public ProduitService(ProduitRepository repoProduit) {
        this.repoProduit = repoProduit;
    }

    public Iterable<Produit> findAllProduits(){
        return repoProduit.findAll();
    }

    public Produit findProduitById(Long id){
        return findOrThrow(id);
    }

    public void removeProduit(Long id){
        repoProduit.deleteById(id);
    }

    public Produit addProduit(Produit produit){
        return repoProduit.save(produit);
    }

    public Produit updateProduit(Long id, Produit produit){
        findOrThrow(id);
        return repoProduit.save(produit);
    }

    private Produit findOrThrow(Long id){
        return repoProduit.findById(id).orElseThrow(
                () -> new NotFoundException("produit" +
                        " by id "+ id + " not found")
        );
    }
}
