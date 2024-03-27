package com.example.rams.Controller;

import com.example.rams.Repository.UtilisateurRep;
import com.example.rams.Service.UtiService;
import com.example.rams.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("u")
@CrossOrigin("http://localhost:3000")
public class UtiController {
    @Autowired
    private UtiService utiService;
    @Autowired
    private UtilisateurRep utilisateurRep;
    @GetMapping
    public List<Utilisateur> utilisateurList(){
        return utiService.UTILISATEUR_LIST();
    }
    @GetMapping("/{email}/{mdp}")
    public Utilisateur findybyuserandEmail(@PathVariable String email, @PathVariable String mdp){
        return utilisateurRep.findbyEmailAndPassword(email, mdp);
    }
}
