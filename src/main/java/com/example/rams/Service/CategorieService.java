package com.example.rams.Service;

import com.example.rams.Repository.CategorieRepository;
import com.example.rams.exceptions.NotFoundException;
import com.example.rams.model.dao.Categorie;
import com.example.rams.model.dao.Produit;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategorieService {

    private final CategorieRepository repo;

    public CategorieService(CategorieRepository repo){
        this.repo = repo;
    }

    public Iterable<Categorie> findAllCategories(){
        return repo.findAll();
    }

    public Categorie findCategorieById(UUID id){
        return findOrThrow(id);
    }

    public void removeCategorie(UUID id){
        repo.deleteById(id);
    }

    public Categorie addCategorie(Categorie categorie){
        return repo.save(categorie);
    }

    public Categorie updateCategorie(UUID id, Categorie categorie){
        findOrThrow(id);
        return repo.save(categorie);
    }

    private Categorie findOrThrow(UUID id){
        return repo.findById(id).orElseThrow(
                () -> new NotFoundException("Categorie" +
                        " by id "+ id + " not found")
        );
    }

}
