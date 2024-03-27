package com.example.rams.Service;

import com.example.rams.Repository.ProjetRepository;
import com.example.rams.model.Projets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService{

    @Autowired
    private ProjetRepository projetRepository;

    public List<Projets> searchProjets(String searchQuery){
        return projetRepository.findbyQuery(searchQuery);
    }
    @Override
    public List<Projets> getAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projets getProjetsById(Long id) {
        return projetRepository.findById(id).get();
    }

    @Override
    public Projets saveProjet(Projets projets) {
        return projetRepository.save(projets);
    }

    @Override
    public Projets updateProjet(Long id, Projets projets) {
       Projets pexistant = projetRepository.findById(id).get();
       pexistant.setObservation(projets.getObservation());
       pexistant.setAuteur(projets.getAuteur());
       pexistant.setDomaine(projets.getDomaine());
       pexistant.setStructureDesire(projets.getStructureDesire());
       pexistant.setPosteDesire(projets.getPosteDesire());
       pexistant.setProvince(projets.getProvince());
       pexistant.setNiveauEtude(projets.getNiveauEtude());
       pexistant.setEtatCivil(projets.getEtatCivil());
       pexistant.setTelephone(projets.getTelephone());

       return projetRepository.save(pexistant);
    }

    @Override
    public void deleteProjet(Long id) {
     projetRepository.deleteById(id);
    }
}
