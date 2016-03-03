/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yannick - Abdourahman
 */
public class Agent {

    private String matricule;
    private String nom;
    private String prenom;
    private List<Session> listeSessionsApprenant;
    private List<Session> listeSessionsFormateur;
    private List<Stage> listStages;

    /**
     * constructeur vide de l'agent
     */
    public Agent() {
        this.matricule = new String();
        this.nom = new String();
        this.prenom = new String();
        this.listeSessionsApprenant = new ArrayList<Session>();
        this.listeSessionsFormateur = new ArrayList<Session>();
        this.listStages = new ArrayList<Stage>();
    }

    /**
     * constructeur de l'agent
     *
     * @param matricule
     */
    public Agent(String matricule) {
        setMatricule(matricule);
        this.nom = new String();
        this.prenom = new String();
        this.listeSessionsApprenant = new ArrayList<Session>();
        this.listeSessionsFormateur = new ArrayList<Session>();
        this.listStages = new ArrayList<Stage>();
    }

    /**
     * constructeur de l'agent
     *
     * @param matricule de l'agent
     * @param nom de l'agent
     */
    public Agent(String matricule, String nom) {
        setMatricule(matricule);
        setNom(nom);
        this.prenom = new String();
        this.listeSessionsApprenant = new ArrayList<Session>();
        this.listeSessionsFormateur = new ArrayList<Session>();
        this.listStages = new ArrayList<Stage>();
    }

    /**
     * constructeur de l'agent
     *
     * @param matricule
     * @param nom
     * @param prenom
     */
    public Agent(String matricule, String nom, String prenom) {
        setMatricule(matricule);
        setNom(nom);
        setPrenom(prenom);
        this.listeSessionsApprenant = new ArrayList<Session>();
        this.listeSessionsFormateur = new ArrayList<Session>();
        this.listStages = new ArrayList<Stage>();
    }

    /**
     *
     * @return matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     *
     * @return nom de l'agent
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return prenom de l'agent
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @return liste de sessions accessibles a l agent en tant qu apprenant
     */
    public List<Session> getListeSessionsApprenant() {
        return listeSessionsApprenant;
    }

    /**
     *
     * @return liste de sessions accessibles a l'agent en tant que formateur
     */
    public List<Session> getListeSessionsFormateur() {
        return listeSessionsFormateur;
    }

    /**
     * setter du matricule de l agent
     *
     * @param matricule
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * setter du nom de l'agent
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * setter du prenom de l'agent
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * setter de la liste des sessions accessibles a l agent en tant qu
     * apprenant
     *
     * @param listeSessionsApprenant
     */
    public void setListeSessionsApprenant(List<Session> listeSessionsApprenant) {
        this.listeSessionsApprenant = listeSessionsApprenant;
    }

    /**
     * setter de la liste des sessions accessibles a l agent en tant que
     * formateur
     *
     * @param listeSessionsFormateur
     */
    public void setListeSessionsFormateur(List<Session> listeSessionsFormateur) {
        this.listeSessionsFormateur = listeSessionsFormateur;
    }

    /**
     *
     * @return liste des stage que dirige l agent
     */
    public List<Stage> getListStages() {
        return listStages;
    }

    /**
     * setter de la liste des stages que dirige l agent
     *
     * @param listStages
     */
    public void setListStages(List<Stage> listStages) {
        this.listStages = listStages;
    }
}
