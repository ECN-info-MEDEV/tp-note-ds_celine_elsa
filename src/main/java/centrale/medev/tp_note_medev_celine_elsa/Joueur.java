/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import java.util.Scanner;

/**
 *Classe permettant de créer et faire jouer un joueur
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }

    public int getNbbateau() {
        return nbbateau;
    }

    public void setNbbateau(int nbbateau) {
        this.nbbateau = nbbateau;
    }
    
    
    //FIXME Vérifier que le bateau ne va pas superposer un autre bateau
    /**
     * Méthode permettant au joueur de placer ses bateaux (en vérifiant qu'ils ne sortent pas de la grille)
     * et de les ajouter à sa liste de bateaux
     */
    public void placeBateau(){
        int longueurgrille=this.grille.getLongueur();
        int largeurgrille=this.grille.getLargeur();
        
        System.out.println("Vous avez 3 bateaux à placer : un porte-avions, un cuirassé et un destroyer.");
        
        System.out.println("Voulez-vous placer votre porte-avion horizontalement (false) ou verticalement (true) ?");
        Scanner sc0 = new Scanner(System.in);
        boolean orientation =sc0.nextBoolean();
        
        int x1=0;
        int y1=0;
        boolean bienplace=false;
        while(bienplace==false){
        System.out.println("Choisissez l'abscisse de l'origine de votre porte-avions");
        Scanner sc = new Scanner(System.in);
        x1 =sc.nextInt();
        if((x1>=0)&&(x1<=longueurgrille)&&(((orientation==false)&&(x1+5<=longueurgrille))||(orientation==true))){
            bienplace=true;
        }
    }
        bienplace=false;
        while(bienplace==false){
        System.out.println("Choisissez l'ordonnée de l'origine de votre porte-avions");
        Scanner sc2 = new Scanner(System.in);
        y1 =sc2.nextInt();
        if((y1>=0)&&(y1<=largeurgrille)&&(((orientation==true)&&(y1+5<=largeurgrille))||(orientation==false))){
            bienplace=true;
        }}
        
        Point2D p1=new Point2D(x1,y1);
        Bateau porteavion=new Bateau("porte-avion","PA",5,p1,false,orientation,new boolean[]{false, false, false, false, false});
        this.grille.getBateaux().add(porteavion);
        
        
        System.out.println("Voulez-vous placer votre cuirassé horizontalement (false) ou verticalement (true) ?");
        Scanner sc3 = new Scanner(System.in);
        boolean orientation2 =sc3.nextBoolean();
        int x2=0;
        int y2=0;
        bienplace=false;
        while(bienplace==false){
        System.out.println("Choisissez l'abscisse de votre cuirassé");
        Scanner sc4 = new Scanner(System.in);
        x2 =sc4.nextInt();
        if((x2>=0)&&(x2<=longueurgrille)&&(((orientation==false)&&(x2+4<=longueurgrille))||(orientation==true))){
            bienplace=true;}}
        
        bienplace=false;
        while(bienplace==false){
        System.out.println("Choisissez l'ordonnée de votre cuirassé");
        Scanner sc5 = new Scanner(System.in);
        y2 =sc5.nextInt();
        if((y2>=0)&&(y2<=largeurgrille)&&(((orientation==true)&&(y2+4<=largeurgrille))||(orientation==false))){
            bienplace=true;
        }}
        Point2D p2=new Point2D(x2,y2);
        Bateau cuirasse=new Bateau("cuirassé","CU",4,p2,false,orientation2,new boolean[]{false, false, false, false});
        this.grille.getBateaux().add(cuirasse);
        
        
        System.out.println("Voulez-vous placer votre destroyer horizontalement (false) ou verticalement (true) ?");
        Scanner sc6 = new Scanner(System.in);
        boolean orientation3 =sc6.nextBoolean();
        int x3=0;
        int y3=0;
        bienplace=false;
        while(bienplace==false){
        System.out.println("Choisissez l'abscisse de votre destroyer");
        Scanner sc7 = new Scanner(System.in);
        x3 =sc7.nextInt();
        if((x3>=0)&&(x3<=longueurgrille)&&(((orientation==false)&&(x3+3<=longueurgrille))||(orientation==true))){
            bienplace=true;}}
       
        
        bienplace=false;
        while(bienplace==false){
        System.out.println("Choisissez l'ordonnée de votre destroyer");
        Scanner sc8 = new Scanner(System.in);
        y3 =sc8.nextInt();
        if((y3>=0)&&(y3<=largeurgrille)&&(((orientation==true)&&(y3+3<=largeurgrille))||(orientation==false))){
            bienplace=true;}}
        Point2D p3=new Point2D(x3,y3);
        Bateau destroyer=new Bateau("destroyer","DE",3,p3,false,orientation3,new boolean[]{false, false, false});
        this.grille.getBateaux().add(destroyer);
        
    }
    
    void tir(Joueur opposant){
        
        Grille grilleOpp = opposant.getGrille();
        int x;
        int y;
        do{
        System.out.println("Vous allez pouvoir tirer sur votre adversaire");
        grilleOpp.afficheGrilleOpposant();
        
        
        System.out.println("Choisissez l'ordonnée de l'origine de votre tir");
        Scanner scA = new Scanner(System.in);
        x =scA.nextInt();
        
        
        System.out.println("Choisissez l'abscisse de l'origine de votre tir");
        Scanner scO = new Scanner(System.in);
        y =scO.nextInt();
        }while(x>grille.getLargeur()||y>grille.getLongueur()||x<0||y<0);
        
        Point2D tir =new Point2D(x,y);
        
        grille.getTirsRecus().add(tir);
    }
}
