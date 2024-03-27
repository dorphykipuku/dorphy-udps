package com.example.rams.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serial;
@Getter
@Setter
public class ProduitDTO {

    private Long id;
    private String nom;
    private double prix;
}
