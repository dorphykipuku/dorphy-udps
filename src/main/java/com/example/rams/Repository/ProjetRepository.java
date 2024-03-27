package com.example.rams.Repository;


import com.example.rams.model.Projets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjetRepository extends JpaRepository<Projets, Long> {
@Query("SELECT p FROM Projets p WHERE p.auteur = :searchQuery OR p.domaine = :searchQuery OR p.province = :searchQuery  OR p.etatCivil = :searchQuery OR p.niveauEtude = :searchQuery OR p.sexe = :searchQuery OR p.age = :searchQuery OR p.structureDesire = : searchQuery OR p.posteDesire = : searchQuery OR p.age = :searchQuery OR p.observation = :searchQuery ORDER BY p.auteur")
List<Projets> findbyQuery(@Param("searchQuery") String searchQuery);
}
