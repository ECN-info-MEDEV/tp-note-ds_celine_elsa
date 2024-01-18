/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

/**
 *Classe permettant de mettre en place la partie
 * @author Céline
 */
public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;

    /**
     *Constructeur d'une partie à partir des joueurs
     * @param joueur1
     * @param joueur2
     */
    public Partie(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }
    
    /**
     * Méthode permettant d'initialiser la partie
     */
    public void initJeu(){
        System.out.println("Au joueur 1 de placer ses bateaux.");
        this.joueur1.placeBateau();
        System.out.println("Au joueur 2 de placer ses bateaux.");
        this.joueur2.placeBateau();
    }
    
    /**
     *Méthode permettant de faire un tour de jeu (chacun à son tour, un joueur voit sa grille et tir)
     */
    public void tourDeJeu(){
        joueur1.getGrille().afficheGrilleJoueur();
        joueur1.tir(joueur2);
        joueur2.getGrille().afficheGrilleJoueur();
        joueur2.tir(joueur1); 
        
    }
    
    /**
     * Méthode permettant d'afficher le résultat du jeu
     */
    public void finDeJeu(){
        if(this.joueur1.getNbbateau()==0){
            System.out.println("Le joueur 2 a gagné !");
        }
        if(this.joueur2.getNbbateau()==0){
            System.out.println("Le joueur 1 a gagné !");
    }
    }
    
    
    
}
