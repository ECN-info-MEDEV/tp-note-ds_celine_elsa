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
    
    
    
    public void afficheGrilleJoueur() {
        grilleJoueur = new String[longueur][largeur];
        
        Point2D origine = new Point2D(0,0);
        
        for (int i=0; i<=longueur;i++){
            for (int k=0; k<=largeur;k++){
                    grilleJoueur[i][k] = "x";
              
        }
        
        for (Bateau perso : listePersonnages) {
            Point2D posP =perso.getPos();
            if (centre.distance(posP) <= distMaxDeplace) {
                plateauVisible[posP.getX() - origine.getX()][posP.getY() - origine.getY()] = "P";
             }
        }
        
        }
        for (int i=distMaxDeplace*2 ; i>0;i--){
            System.out.println();
            for (int k=0; k< 2*distMaxDeplace;k++){
                System.out.print(" "+(plateauVisible[k][i])+" ");
            }
            
        }
        System.out.println("");

    }

}
