/*
SARINENA, TDC , LightOff_version_console, 25/10/2023
 */
package lightoff_sarinena_version_console;

/**
 * Représente une grille de cellules lumineuses
 * @author pierr
 */
public class GrilleDeCellules {
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellule; 

    /**
     * permet de créer une nouvelle grille de cellules lumineuses avec un nombre spécifié de lignes et de colonnes.
     * @param nbLignes correspond aux nombres de lignes de la grille
     * @param nbColonnes correspond aux nombres de colonnes de la grille
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
    }

    
    
}
