/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Yannick - Abdourahman
 */
public class UV {
    private Integer numero;
    private String nom;

    public UV() {
        this.numero = new Integer(0);
        this.nom = new String();
    }

    public UV(Integer numero, String nom) {
        setNumero(numero);
        setNom(nom);
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
