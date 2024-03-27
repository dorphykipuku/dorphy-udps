package com.example.rams.model.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cat")
public class Categorie implements Serializable {
    @Serial
    private static final long serialVersionUID = 1905122041950251201L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column(name = "catid")
    private UUID id;
    @Column(name = "catdesc")
    private String description;
}
