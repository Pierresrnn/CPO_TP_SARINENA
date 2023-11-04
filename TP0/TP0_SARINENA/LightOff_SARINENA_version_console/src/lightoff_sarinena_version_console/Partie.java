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

    public Partie() {
        this.grille = new GrilleDeJeu(7, 7); // Taille par défaut
        this.nbCoups = 0;
    }

    public void initialiserPartie(int largeur, int hauteur) {
        grille = new GrilleDeJeu(largeur, hauteur);
        grille.melangerMatriceAleatoirement(10);
        nbCoups = 0;
    }

    public void LancerPartie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue et c'est l'heure de jouer à LightOff :");
        System.out.println("Choisir la difficulté de la partie : \n 1) Facile \n 2) Moyen \n 3) Difficile");
        int choixDifficulte = sc.nextInt();

        int largeur, hauteur;
        int nbCoupsMax = 0;
        switch (choixDifficulte) {
            case 1:
                largeur = 4;
                hauteur = 4;
                nbCoupsMax = 100;
                break;
            case 2:
                largeur = 7;
                hauteur = 7;
                nbCoupsMax = 15;
                break;
            case 3:
                largeur = 10;
                hauteur = 10;
                nbCoupsMax = 8;
                break;
            default:
                System.out.println("Difficulté invalide. Choisissez une option valide.");
                return;
        }

        initialiserPartie(largeur, hauteur);

            while (nbCoups < nbCoupsMax && !grille.cellulesToutesEteintes()) {
                System.out.println("A votre tour, choisissez ce que vous voulez modifier :");
                System.out.println("1) Une Ligne");
                System.out.println("2) Une Colonne");
                System.out.println("3) Une diagonale Descendante");
                System.out.println("4) Une Diagonale Montante");
                System.out.println(grille);
                int modif = sc.nextInt();

                if (modif == 1) {
                    System.out.println("Choisissez le numero de la ligne à modifier :");
                    int num = sc.nextInt();
                    grille.activerLigneDeCellules(num);
                } else if (modif == 2) {
                    System.out.println("Choisissez le numero de la colonne à modifier :");
                    int num = sc.nextInt();
                    grille.activerColonneDeCellules(num);
                } else if (modif == 3) {
                    grille.activerDiagonaleDescendante();
                } else if (modif == 4) {
                    grille.activerDiagonaleMontante();
                } else {
                    System.out.println("Option invalide. Choisissez une option valide.");
                    continue;
                }
                nbCoups++;
            }
        if (grille.cellulesToutesEteintes()) {
            System.out.println("Félicitations, vous avez gagné en " + nbCoups + " coups !");
        } else {
            System.out.println("Désolé, vous avez dépassé le nombre maximum de coups. La partie est terminée.");
        }
    }
}

