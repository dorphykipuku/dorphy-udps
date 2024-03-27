package com.example.rams.Service;

import com.example.rams.Repository.UtilisateurRep;
import com.example.rams.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtiImpll implements UtiService{
    @Autowired
    private UtilisateurRep utilisateurRep;
    @Override
    public List<Utilisateur> UTILISATEUR_LIST() {
        return utilisateurRep.findAll();
    }
}
