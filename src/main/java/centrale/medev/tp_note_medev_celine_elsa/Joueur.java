/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import java.util.Scanner;

/**
 *
 * @author Céline
 */
class Joueur {
    private String nom;
    private Grille grille;
    private int nbbateau;

    public Joueur(String nom, Grille grille, int nbbateau) {
        this.nom = nom;
        this.grille = new Grille(grille);
        this.nbbateau = nbbateau;
    }
    
    public Joueur(Joueur j) {
        this.nom = j.nom;
        this.grille = new Grille(j.grille);
        this.nbbateau = j.nbbateau;
    }
    
    
    public void placeBateau(){
        System.out.println("Vous avez 3 bateaux à placer : un porte-avions, un cuirassé et un destroyer.");
        System.out.println("Voulez-vous placer votre porte-avion horizontalement (0) ou verticalement (1) ?");
        Scanner sc0 = new Scanner(System.in);
        boolean orientation =sc0.nextBoolean();
        System.out.println("Choisissez l'abscisse de l'origine de votre porte-avions");
        Scanner sc = new Scanner(System.in);
        int x1 =sc.nextInt();
        System.out.println("Choisissez l'ordonnée de l'origine de votre porte-avions");
        Scanner sc2 = new Scanner(System.in);
        int y1 =sc2.nextInt();
        Point2D p1=new Point2D(x1,y1);
        Bateau porteavion=new Bateau("porte-avion",5,p1,0,orientation,[0,0,0,0,0]);
        
        System.out.println("Voulez-vous placer votre porte-avion horizontalement (0) ou verticalement (1) ?");
        Scanner sc3 = new Scanner(System.in);
        boolean orientation2 =sc3.nextBoolean();
        System.out.println("Choisissez l'abscisse de votre cuirassé");
        Scanner sc4 = new Scanner(System.in);
        int x2 =sc4.nextInt();
        System.out.println("Choisissez l'ordonnée de votre cuirassé");
        Scanner sc5 = new Scanner(System.in);
        int y2 =sc5.nextInt();
        Point2D p2=new Point2D(x2,y2);
        Bateau cuirasse=new Bateau("cuirassé",4,p2,0,orientation,[0,0,0,0]);
        
        System.out.println("Voulez-vous placer votre porte-avion horizontalement (0) ou verticalement (1) ?");
        Scanner sc6 = new Scanner(System.in);
        boolean orientation3 =sc6.nextBoolean();
        System.out.println("Choisissez l'abscisse de votre destroyer");
        Scanner sc7 = new Scanner(System.in);
        int x3 =sc7.nextInt();
        System.out.println("Choisissez l'ordonnée de votre destroyer");
        Scanner sc8 = new Scanner(System.in);
        int y3 =sc8.nextInt();
        Point2D p3=new Point2D(x3,y3);
        Bateau destroyer=new Bateau("destroyer",3,p3,0,orientation,[0,0,0]);
        
    }
    
}
