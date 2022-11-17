/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ecn.medev;

/**
 * Classe constructible
 * @author Pierre Baudet
 */
public class Constructible extends Achetable {
    
    private int nbMaisons;
    private int nbHotels;
    
    public Constructible() {
        this.nbMaisons = 0;
        this.nbHotels = 0;
    }

    public Constructible(int nbMaisons, int nbHotels) {
        this.nbMaisons = nbMaisons;
        this.nbHotels = nbHotels;
    }

    public int getNbMaisons() {
        return nbMaisons;
    }

    public int getNbHotels() {
        return nbHotels;
    }

    public void setNbMaisons(int nbMaisons) {
        this.nbMaisons = nbMaisons;
    }

    public void setNbHotels(int nbHotels) {
        this.nbHotels = nbHotels;
    }
    
    private void contruire(int nbNouvellesMaisons, int nbNouveauxHotels) {
        this.nbMaisons += nbNouvellesMaisons;
        this.nbHotels += nbNouveauxHotels;
    }
}