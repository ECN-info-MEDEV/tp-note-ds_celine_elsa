/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package centrale.medev.tp_note_medev_celine_elsa;

import java.util.Scanner;

/**
 *
 * @author elsaa
 */
public class TP_note_MEDEV_Celine_Elsa {

    
    public static void main(String[] args) {
        
        System.out.println("Nom du joueur 1 ?");
        Scanner sc = new Scanner(System.in);
        String nom1 =sc.next();
        System.out.println("Nom du joueur 2 ?");
        Scanner sc2 = new Scanner(System.in);
        String nom2 =sc2.next();
        System.out.println("Longueur de la grille ?");
        Scanner sc3 = new Scanner(System.in);
        int longueur =sc3.nextInt();
        System.out.println("Largeur de la grille ?");
        Scanner sc4 = new Scanner(System.in);
        int largeur =sc4.nextInt();
        
        //créer grille
        Grille grillej1=new Grille(longueur, largeur);
        Grille grillej2=new Grille(longueur, largeur);
        
        //créer joueurs
        Joueur j1=new Joueur(nom1,grillej1,3);
        Joueur j2=new Joueur(nom2,grillej2,3);
        
        //Initialiser partie
        Partie partie=new Partie(j1,j2);
        partie.initJeu();
        
        
        //Condition d'arrêt du jeu
        while ((j1.getNbbateau()!=0)&&(j2.getNbbateau()!=0)){
            partie.tourDeJeu();
        }
        
        //Fin de partie
        partie.finDeJeu();
        
    }
}
