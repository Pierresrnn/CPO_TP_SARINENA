/*
SARINENA, TDC , LightOff_version_console, 25/10/2023
 */
package lightoff_sarinena_version_console;

import java.util.Random;

/**
 * Représente une grille de cellules lumineuses
 *
 * @author pierr
 */
public class GrilleDeJeu {

    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellule;

    /**
     * permet de créer une nouvelle grille de cellules lumineuses avec un nombre
     * spécifié de lignes et de colonnes.
     *
     * @param nbLignes correspond aux nombres de lignes de la grille
     * @param nbColonnes correspond aux nombres de colonnes de la grille
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.matriceCellule = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                this.matriceCellule[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Permet d'éteindre toutes les cellules de la grille, en passant chaque
     * cellule en état "éteint"
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                this.matriceCellule[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Permet d'activer de manière aléatoire soit une ligne, soit une colonne,
     * soit une diagonale de cellules dans la grille.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int ligne_choisie;
        int colonne_choisie;
        int diagonale_choisie;
        Random generateurAleat = new Random();
        int nombre_alea = generateurAleat.nextInt(3);
        if (nombre_alea == 0) {
            ligne_choisie = generateurAleat.nextInt(this.nbLignes);
            for (int colonne = 0; colonne < this.nbColonnes; colonne++) {
                this.matriceCellule[ligne_choisie][colonne].activerCellule();
            }
        } else if (nombre_alea == 1) {
            colonne_choisie = generateurAleat.nextInt(this.nbColonnes);
            for (int ligne = 0; ligne < this.nbColonnes; ligne++) {
                this.matriceCellule[ligne][colonne_choisie].activerCellule();
            }
        } else {
            int nombre_alea_diag = generateurAleat.nextInt(2);
            if (nombre_alea_diag == 0) { //diagonale du haut vers le bas
                for (int i = 0; i < this.nbLignes; i++) {
                    for (int j = 0; j < this.nbColonnes; j++) {
                        if (j == i) {
                            this.matriceCellule[i][i].activerCellule();
                        }
                    }
                }
            } else { //diagonale du bas vers le haut
                int cellule_parcourir = Math.min(this.nbLignes, this.nbColonnes);
                for (int i = 0; i < cellule_parcourir; i++) {
                    for (int j = 0; j < cellule_parcourir; j++) {
                        if (cellule_parcourir - i - 1 == j) {
                            this.matriceCellule[i][j].activerCellule();
                        }
                    }
                }
            }
        }
    }
        /**
         * Permet de générer un plateau de cellules lumineuses de manière
         * aléatoire à partir d’un nombre spécifié de tours.
         *
         * @param nbTours Correspond aux nombres de changement aléatoire
         * effectué
         */
    public void melangerMatriceAleatoirement(int nbTours) {
        this.eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Permet d'activer toutes les cellules d'une ligne
     *
     * @param idLigne correspond a la ligne choisie
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int k = 0; k < idLigne; k++) {
            this.matriceCellule[idLigne][k].activerCellule();
        }
    }

    /**
     * Permet d'activer toutes les cellules d'une colonne
     *
     * @param idColonne correspond a la colonne choisie
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int l = 0; l < idColonne; l++) {
            this.matriceCellule[l][idColonne].activerCellule();
        }
    }

    /**
     * Permet d'activer la diagonale descendantede la grille en allumant les
     * cellules correspondantes.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                if (j == i) {
                    this.matriceCellule[i][i].activerCellule();
                }
            }
        }
    }

    /**
     * Permet d'activer la diagonale montante la grille en allumant les cellules
     * correspondantes.
     */
    public void activerDiagonaleMontante() {
        int cellule_parcourir = Math.min(this.nbLignes, this.nbColonnes);
        for (int i = 0; i < cellule_parcourir; i++) {
            for (int j = 0; j < cellule_parcourir; j++) {
                if (cellule_parcourir - i - 1 == j) {
                    this.matriceCellule[i][j].activerCellule();

                }
            }
        }
    }

    /**
     * Vérifie si toutes les cellules de la grille sont éteintes.
     *
     * @return Elle retourne true si toutes les cellules sont éteintes, et false
     * sinon.
     */
    public boolean cellulesToutesEteintes() {
        int verif = 0;
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                if (this.matriceCellule[i][j].estEteint() == false) {
                    verif += 1;
                }
            }
        }
        if (verif != 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Permet d'afficher l'état de la grille sous forme d'une représentation
     * visuelle organisée
     *
     * @return renvoie la grille de jeu à afficher
     */
    @Override
    public String toString() {
        String grille = "   |";
        for (int h = 0; h < this.nbColonnes; h++) {
            grille += " " + h + " |";
        }
        grille += "\n";
        for (int g = 0; g < this.nbColonnes + 1; g++) {
            grille += "----";
        }
        for (int f = 0; f < this.nbLignes * 2; f++) {
            grille += "\n";
            if (f % 2 == 0) {
                for (int j = 0; j < this.nbColonnes + 1; j++) {
                    if (j == 0) {
                        grille += " " + f / 2 + " |";
                    } else {
                        grille += " " + this.matriceCellule[f / 2][j - 1].toString() + " |";
                    }
                }
            } else {
                for (int d = 0; d < this.nbColonnes + 1; d++) {
                    grille += "----";
                }
            }
        }
        return grille;
    }

}
