/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import static java.lang.Integer.max;
import static java.lang.Math.abs;

/**
 * Classe décrivant une case de la map du jeu
 * @author elsaa
 */
public class Point2D {
    private int x;
    private int y;

    /**
     * Constructeur par défaut
     */
    public Point2D() {
        x = 0;
        y = 0;
    }

    /**
     * Constructeur avec paramètres
     * @param x
     * @param y
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    public int getX() {

        return x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }
    
    /**
     * Constructeur de recopie
     * @param p
     */
    public Point2D(Point2D p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
//FIXME
    /**
     * Affichage d'un point
     */
    /**
    public void affiche() {
        System.out.println(" - Position : [" + x + ";" + y + "]");

    }**/

    /**
     * Metche déplacant un point d'un nombre de cases données
     * @param dx
     * @param dy
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Pramètre permettant de mettre un point à n'importe quel endroit
     * @param x
     * @param y
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Permet d'effectuer des vérification d'égalité de paramètres entre 2 points
     * @param p
     * @return
     */
    public boolean equals(Point2D p){
        boolean b ; 
        b = this.x==p.x && this.y==p.y;
        return b;
    }

    
}

