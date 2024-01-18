/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

/**
 *
 * @author Céline
 */
public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;

    public Partie(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }
    
    public void tourDeJeu(){
        joueur1.getGrille().afficheGrilleJoueur();
        joueur1.tir(joueur2);
        joueur2.getGrille().afficheGrilleJoueur();
        joueur2.tir(joueur1);
        
        
        
    }
    
    
    
}
