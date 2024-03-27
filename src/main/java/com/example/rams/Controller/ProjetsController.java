package com.example.rams.Controller;

import com.example.rams.Repository.ProjetRepository;
import com.example.rams.Service.ProjetService;
import com.example.rams.model.Projets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projets")
@CrossOrigin("http://localhost:3000")
public class ProjetsController {
     @Autowired
    private ProjetService projetService;
     @Autowired
     private ProjetRepository projetRepository;

    @GetMapping
    public List<Projets> projetsList(){
    return projetService.getAllProjets();
    }
    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id){
         projetService.deleteProjet(id);
         return "projet supprimé";
    }
    @PutMapping("/modifier/{id}")
    public Projets modifier(@PathVariable Long id, @RequestBody Projets projets){
        return projetService.updateProjet(id, projets);
    }
    @PostMapping("/ajout")
    public Projets ajouter(@RequestBody Projets projets){
        return projetService.saveProjet(projets);
    }
    @GetMapping("/{id}")
    public Projets getbyidProjet(@PathVariable Long id){
        return projetService.getProjetsById(id);
    }
    @GetMapping("/s/{query}")
    public ResponseEntity<List<Projets>> searchProjets(@PathVariable String query){
        List<Projets> lesProjets = projetRepository.findbyQuery(query);
        return ResponseEntity.ok(lesProjets);
    }

}
