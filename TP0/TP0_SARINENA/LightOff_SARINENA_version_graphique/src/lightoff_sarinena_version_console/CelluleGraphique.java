/*
SARINENA, TDC , LightOff_version_graphique, 06/11/2023
 */
package lightoff_sarinena_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author pierr
 */
public class CelluleGraphique extends JButton {

    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }
    // Methode gérant le dessin de la cellule

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setText(celluleLumineuseAssociee.toString());
    }

}
