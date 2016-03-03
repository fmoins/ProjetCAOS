/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Yannick - Abdourahman
 */
public class Session {

    private UV uv;
    private Date date;
    private String lieu;
    private Integer nbMin;
    private Integer nbMax;
    private Integer nbFormateur;
    private List<Agent> listeApprenants;
    private List<Agent> listeFormateurs;

    public Session() {
        this.date = new Date();
        this.lieu = new String();
        this.listeApprenants = new ArrayList<Agent>();
        this.listeFormateurs = new ArrayList<Agent>();
        this.nbFormateur = new Integer(0);
        this.nbMax = new Integer(0);
        this.nbMin = new Integer(0);
        this.uv = new UV();

    }

    public Session(UV uv, Date date, String lieu, Integer nbMin, Integer nbMax, Integer nbFormateur) {
        setUv(uv);
        setDate(date);
        setLieu(lieu);
        setNbMin(nbMin);
        setNbMax(nbMax);
        setNbFormateur(nbFormateur);
        this.listeApprenants = new ArrayList<Agent>();
        this.listeFormateurs = new ArrayList<Agent>();

    }

    public UV getUv() {
        return uv;
    }

    public Date getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public Integer getNbMin() {
        return nbMin;
    }

    public Integer getNbMax() {
        return nbMax;
    }

    public Integer getNbFormateur() {
        return nbFormateur;
    }

    public List<Agent> getListeApprenants() {
        return listeApprenants;
    }

    public List<Agent> getListeFormateurs() {
        return listeFormateurs;
    }

    public void setUv(UV uv) {
        this.uv = uv;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setNbMin(Integer nbMin) {
        this.nbMin = nbMin;
    }

    public void setNbMax(Integer nbMax) {
        this.nbMax = nbMax;
    }

    public void setNbFormateur(Integer nbFormateur) {
        this.nbFormateur = nbFormateur;
    }

    public void setListeApprenants(List<Agent> listeApprenants) {
        this.listeApprenants = listeApprenants;
    }

    public void setListeFormateurs(List<Agent> listeFormateurs) {
        this.listeFormateurs = listeFormateurs;
    }

}
