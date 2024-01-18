/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import java.util.ArrayList;

/**
 * Permet de paramétrer les grilles de jeu des joueurs 
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

    /**
     * Constructeur à paramètres
     * @param longueur de la grille
     * @param largeur de la grille  (on aurait pu faire juste tailel si on considère la grille forcément carrée)
     * @param bateaux liste des bateaux se trouvant sur la grille
     * @param joueur joueur à qui appartient les bateux sur la grille 
     * @param tirsRecus liste des tirs reçus par le joueur
     * @param grilleJoueur grille vue par le joueur
     * @param grilleOpposant grille vue par son opposant
     */
    public Grille(int longueur, int largeur, ArrayList<Bateau> bateaux, Joueur joueur,ArrayList<Point2D> tirsRecus, String[][] grilleJoueur, String[][] grilleOpposant) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.bateaux = new ArrayList<>(bateaux);
        this.joueur = new Joueur(joueur);
        this.grilleJoueur = grilleJoueur;
        this.grilleOpposant = grilleOpposant;
        this.tirsRecus = new ArrayList(tirsRecus);
    }
    
    /**
     * Constructeur de recopie
     * @param g
     */
    public Grille(Grille g) {
        this.longueur = g.longueur;
        this.largeur = g.largeur;
        this.bateaux = new ArrayList<>(g.bateaux);
        this.joueur = new Joueur(g.joueur);
        this.grilleJoueur = g.grilleJoueur;
        this.grilleOpposant = g.grilleOpposant;
        this.tirsRecus = new ArrayList(g.tirsRecus);
    }

    /**
     *
     * @return
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     *
     * @param longueur
     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    /**
     *
     * @return
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     *
     * @param largeur
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     *
     * @return
     */
    public ArrayList<Bateau> getBateaux() {
        return bateaux;
    }

    /**
     *
     * @param bateaux
     */
    public void setBateaux(ArrayList<Bateau> bateaux) {
        this.bateaux = bateaux;
    }

    /**
     *
     * @return
     */
    public Joueur getJoueur() {
        return joueur;
    }

    /**
     *
     * @param joueur
     */
    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    /**
     *
     * @return
     */
    public String[][] getGrilleJoueur() {
        return grilleJoueur;
    }

    /**
     *
     * @param grilleJoueur
     */
    public void setGrilleJoueur(String[][] grilleJoueur) {
        this.grilleJoueur = grilleJoueur;
    }

    /**
     *
     * @return
     */
    public String[][] getGrilleOpposant() {
        return grilleOpposant;
    }

    /**
     *
     * @param grilleOpposant
     */
    public void setGrilleOpposant(String[][] grilleOpposant) {
        this.grilleOpposant = grilleOpposant;
    }

    /**
     *
     * @return
     */
    public ArrayList<Point2D> getTirsRecus() {
        return tirsRecus;
    }

    /**
     *
     * @param tirsRecus
     */
    public void setTirsRecus(ArrayList<Point2D> tirsRecus) {
        this.tirsRecus = tirsRecus;
    }

   
    
    /**
     * Permet d'afficher la grille du joueur pour lui, voir l'avancement de 
     * son opposant
     */
    public void afficheGrilleJoueur() {
       
        Point2D origine = new Point2D(0, 0);

        for (int i = 0; i <= longueur; i++) {
            for (int k = 0; k <= largeur; k++) {
                grilleJoueur[i][k] = "-";
            }
        }

        for (Point2D tir : tirsRecus ){
            grilleJoueur[tir.getX()][tir.getY()]="x";
        }
        
        for (Bateau bateau : bateaux) {
            Point2D posB = bateau.getOrigine();
            for (int i=0; i<bateau.getTaille(); i++) {
                String iconeGrille = bateau.getInitiale();
                if (bateau.getEtat()[i]==true){
                    iconeGrille="T"; //bateau touché (=T)
                }
                if (bateau.isOrientation() == false) {
                    grilleJoueur[posB.getX() + i][posB.getY()] = iconeGrille;
                }
                if (bateau.isOrientation() == true) {
                    grilleJoueur[posB.getX()][posB.getY() + i] = iconeGrille;
                }
            }
        }
        for (int i = longueur; i > 0; i--) {
            System.out.println();
            for (int k = 0; k < largeur; k++) {
                System.out.print(" " + (grilleJoueur[k][i]) + " ");
            }

        }
        System.out.println("");

    }
    /**
     * Permet d'afficher la grille du joueur pour son opposant, voir les 
     * touches et les tirs dèjà effectués
     */
    public void afficheGrilleOpposant() {
        grilleOpposant = new String[longueur][largeur];

        Point2D origine = new Point2D(0, 0);

        for (int i = 0; i <= longueur; i++) {
            for (int k = 0; k <= largeur; k++) {
                grilleJoueur[i][k] = "-";
            }
        }

        for (Point2D tir : tirsRecus ){
            grilleJoueur[tir.getX()][tir.getY()]="x";
        }
        
        for (Bateau bateau : bateaux) {
            Point2D posB = bateau.getOrigine();
            for (int i=0; i<bateau.getTaille(); i++) {
                
                if (bateau.getEtat()[i]==true){
                    
                    if (bateau.isOrientation() == false) {
                        grilleJoueur[posB.getX() + i][posB.getY()] = "T";
                    }
                    else if (bateau.isOrientation() == true) {
                        grilleJoueur[posB.getX()][posB.getY() + i] = "T";
                    }
            }
        }

        
        for (int i = longueur; i > 0; i--) {
            System.out.println();
            for (int k = 0; k < largeur; k++) {
                System.out.print(" " + (grilleJoueur[k][i]) + " ");
            }

        }
        System.out.println("");

    }
}
    public void resultTir(Point2D tir){
        int x=tir.getX();
        int y=tir.getY();
        
        for (Bateau bateau : bateaux){
            for (int i=0; i<bateau.getTaille(); i++) {
                if (bateau.isOrientation() == false) {
                    if ((bateau.getOrigine().getX()+i==x)&&(bateau.getOrigine().getY()==y)){
                        System.out.println("Touché !");
                        bateau.getEtat()[i]=true;
                        if (bateau.verifCoule()){
                            System.out.println("Coulé");
                        }
                    }
                    else if ((bateau.getOrigine().getX()==x)&&(bateau.getOrigine().getY()+i==y)){
                        System.out.println("Touché !");
                        bateau.getEtat()[i]=true;
                        if (bateau.verifCoule()){
                            System.out.println("Coulé");
                        }
                    } 
                }
            }
        }
    }
}
