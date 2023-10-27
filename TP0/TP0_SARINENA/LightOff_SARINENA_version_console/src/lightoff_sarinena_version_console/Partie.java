/*
SARINENA, TDC , LightOff_version_console, 27/10/2023
 */
package lightoff_sarinena_version_console;

import java.util.Scanner;

/**
 * Représente une partie du jeu LightOff en utilisant une grille de cellules
 * lumineuses
 *
 * @author pierr
 */
public class Partie {

    GrilleDeJeu grille;
    int nbCoups;

    /**
     * crée une nouvelle instance de la grille de cellules lumineuses, qui sera
     * dès lors accessible via la référence grille ; en outre, il initialise le
     * compteur nbCoups à zéro
     */
    public Partie() {
        this.grille = new GrilleDeJeu(7, 7);
        this.nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
        nbCoups = 0;
    }

    public void LancerPartie() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue et c'est l'heure de jouer à LightOff :");
        initialiserPartie();

        while (grille.cellulesToutesEteintes() == false) {
            System.out.println("A votre tour, choissisez qu'est-ce que vous voulez modifier:");
            System.out.println("1) Une Ligne");
            System.out.println("2) Une Colonne");
            System.out.println("3) Une diagonale Descendante");
            System.out.println("4) Une Diagonale Montante");
            System.out.println(grille);
            int modif = sc.nextInt();

            if (modif == 1) {
                System.out.println("Choissisez votre ligne à modifier");
                int numL = sc.nextInt();
                grille.activerLigneDeCellules(numL);
                System.out.println(grille);
                nbCoups++;

            } else if (modif == 2) {
                System.out.println("Choissisez votre colonne à modifier");
                int numC = sc.nextInt();
                grille.activerColonneDeCellules(numC);
                System.out.println(grille);
                nbCoups++;

            } else if (modif == 3) {
                grille.activerDiagonaleDescendante();
                System.out.println(grille);
                nbCoups++;

            }
            if (modif == 4) {
                grille.activerDiagonaleMontante();
                System.out.println(grille);
            }
            nbCoups++;
        }
    }

}
