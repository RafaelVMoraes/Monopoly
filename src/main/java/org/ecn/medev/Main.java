package org.ecn.medev;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lancement du Jeu ");
        Plateau gameBoard=new Plateau();
        gameBoard.init();

        int nombreDeTours=5;
        int i=0;
        while(i<nombreDeTours){
            //gameBoard.tourDeJeu();
            gameBoard.affiche();
            gameBoard.tourDeJeu();
        }


    }
}