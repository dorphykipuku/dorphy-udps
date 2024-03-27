package com.example.rams.Service;

import com.example.rams.model.Projets;

import java.util.List;

public interface ProjetService {

    List<Projets> getAllProjets();
    Projets getProjetsById(Long id);
    Projets saveProjet(Projets projets);
    Projets updateProjet(Long id, Projets projets);
    void deleteProjet(Long id);
}
