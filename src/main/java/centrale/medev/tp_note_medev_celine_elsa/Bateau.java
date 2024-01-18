/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import java.util.ArrayList;

/**
 *Classe permettant de créer un bateau et de gérer son état
 * @author Céline
 */
class Bateau {
    private String nom;
    private String initiale;
    private int taille;
    private Point2D origine; 
    private boolean coule; //vie=0
    private boolean orientation; //horizontal=0
    private boolean[] etat;

    public Bateau(String nom,String initiale, int taille, Point2D origine, boolean coule, boolean orientation, boolean[] etat) {
        this.nom = nom;
        this.taille = taille;
        this.origine = origine;
        this.coule = coule;
        this.orientation = orientation;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }

    public Point2D getOrigine() {
        return origine;
    }

    public boolean isCoule() {
        return coule;
    }

    public boolean isOrientation() {
        return orientation;
    }

    public boolean[] getEtat() {
        return etat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setOrigine(Point2D origine) {
        this.origine = origine;
    }

    public void setCoule(boolean coule) {
        this.coule = coule;
    }

    public void setOrientation(boolean orientation) {
        this.orientation = orientation;
    }

    public void setEtat(boolean[] etat) {
        this.etat = etat;
    }

    public String getInitiale() {
        return initiale;
    }

    public void setInitiale(String initiale) {
        this.initiale = initiale;
    }
    
    
    
    
}
