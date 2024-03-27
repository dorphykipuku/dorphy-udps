package com.example.rams.Repository;

import com.example.rams.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UtilisateurRep extends JpaRepository<Utilisateur, Long> {
    @Query("SELECT u FROM Utilisateur u WHERE u.email= ?1 AND u.mdp = ?2")
    public Utilisateur findbyEmailAndPassword(String email, String password);
}
