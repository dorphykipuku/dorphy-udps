package com.example.rams.Repository;

import com.example.rams.model.dao.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CategorieRepository extends CrudRepository<Categorie, UUID> {
}
