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
public class Stage {
    private List<Session> listeSessions;
    private Agent directeur;

    public Stage() {
    }

    public Stage(List<Session> listeSessions, Agent directeur) {
        setListeSessions(listeSessions);
        setDirecteur(directeur);
    }
 
    public List<Session> getListeSessions() {
        return listeSessions;
    }

    public Agent getDirecteur() {
        return directeur;
    }

    public void setListeSessions(List<Session> listeSessions) {
        this.listeSessions = listeSessions;
    }

    public void setDirecteur(Agent directeur) {
        this.directeur = directeur;
    }
}
