package com.mproduit.produitwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produit {

    private Long   id;
    private String titre;
    private String description;
    private String image;
    private Double prix;
}
