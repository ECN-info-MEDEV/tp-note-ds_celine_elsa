/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import java.util.ArrayList;

/**
 *
 * @author Céline
 */
public class Grille {
    private int longueur;
    private int largeur;
    private ArrayList<Bateau> bateaux;
    private Joueur joueur;
    private String[][] grilleJoueur;
    private String[][] grilleOpposant;

    public Grille(int longueur, int largeur, ArrayList<Bateau> bateaux, Joueur joueur, String[][] grilleJoueur, String[][] grilleOpposant) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.bateaux = new ArrayList<Bateau>(bateaux);
        this.joueur = new Joueur(joueur);
        this.grilleJoueur = grilleJoueur;
        this.grilleOpposant = grilleOpposant;
    }
    
    public Grille(Grille g) {
        this.longueur = g.longueur;
        this.largeur = g.largeur;
        this.bateaux = new ArrayList<Bateau>(g.bateaux);
        this.joueur = new Joueur(g.joueur);
        this.grilleJoueur = g.grilleJoueur;
        this.grilleOpposant = g.grilleOpposant;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public ArrayList<Bateau> getBateaux() {
        return bateaux;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public String[][] getGrilleJoueur() {
        return grilleJoueur;
    }

    public String[][] getGrilleOpposant() {
        return grilleOpposant;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setBateaux(ArrayList<Bateau> bateaux) {
        this.bateaux = bateaux;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public void setGrilleJoueur(String[][] grilleJoueur) {
        this.grilleJoueur = grilleJoueur;
    }

    public void setGrilleOpposant(String[][] grilleOpposant) {
        this.grilleOpposant = grilleOpposant;
    }
    
    
    
    
}
