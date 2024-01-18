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
    private ArrayList<Point2D> tirsRecus;
    private String[][] grilleJoueur;
    private String[][] grilleOpposant;

    public Grille(int longueur, int largeur, ArrayList<Bateau> bateaux, Joueur joueur,ArrayList<Point2D> tirsRecus, String[][] grilleJoueur, String[][] grilleOpposant) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.bateaux = new ArrayList<>(bateaux);
        this.joueur = new Joueur(joueur);
        this.grilleJoueur = grilleJoueur;
        this.grilleOpposant = grilleOpposant;
        this.tirsRecus = new ArrayList(tirsRecus);
    }
    
    public Grille(Grille g) {
        this.longueur = g.longueur;
        this.largeur = g.largeur;
        this.bateaux = new ArrayList<>(g.bateaux);
        this.joueur = new Joueur(g.joueur);
        this.grilleJoueur = g.grilleJoueur;
        this.grilleOpposant = g.grilleOpposant;
        this.tirsRecus = new ArrayList(g.tirsRecus);
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public ArrayList<Bateau> getBateaux() {
        return bateaux;
    }

    public void setBateaux(ArrayList<Bateau> bateaux) {
        this.bateaux = bateaux;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public String[][] getGrilleJoueur() {
        return grilleJoueur;
    }

    public void setGrilleJoueur(String[][] grilleJoueur) {
        this.grilleJoueur = grilleJoueur;
    }

    public String[][] getGrilleOpposant() {
        return grilleOpposant;
    }

    public void setGrilleOpposant(String[][] grilleOpposant) {
        this.grilleOpposant = grilleOpposant;
    }

    public ArrayList<Point2D> getTirsRecus() {
        return tirsRecus;
    }

    public void setTirsRecus(ArrayList<Point2D> tirsRecus) {
        this.tirsRecus = tirsRecus;
    }
    
    
    public void afficheGrilleJoueur() {
        grilleJoueur = new String[longueur][largeur];
        
        Point2D origine = new Point2D(0,0);
        
        for (int i=0; i<=longueur;i++){
            for (int k=0; k<=largeur;k++){
                    grilleJoueur[i][k] = "-";
              
        }
        
        for (Bateau bateau : bateaux) {
            Point2D posB =bateau.getOrigine();
            for (int i=0, i<bateau.getLongueur(),i++){
                if (bateau.isOrientation()==false){
                    grilleJoueur[posB.getX()+i][posB.getY()] = bateau.getInitiale(); 
                }
                if (bateau.isOrientation()==true){
                    grilleJoueur[posB.getX()][posB.getY()+i] = bateau.getInitiale(); 
                }
             }
        }
        
        }
        for (int i=longueur ; i>0;i--){
            System.out.println();
            for (int k=0; k< largeur;k++){
                System.out.print(" "+(grilleJoueur[k][i])+" ");
            }
            
        }
        System.out.println("");

    }

}
