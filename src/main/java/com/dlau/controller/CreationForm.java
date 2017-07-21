package com.dlau.controller;

import javax.validation.constraints.Pattern;

//import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CreationForm {

    @Size(min=1)
    private String libelle;
    @Size(min=1)
    @Pattern(regexp="\\d*")
    private String quantite;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String pLibelle) {
        libelle = pLibelle;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(final String pQuantite) {
        quantite = pQuantite;
    }
}