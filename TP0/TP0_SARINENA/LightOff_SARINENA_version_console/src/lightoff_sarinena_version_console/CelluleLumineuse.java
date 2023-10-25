/*
SARINENA, TDC , LightOff_version_console, 25/10/2023
 */
package lightoff_sarinena_version_console;

/**
 * Représente une cellule lumineuse qui peut être dans l'état "allumée" ou
 * "éteinte".
 * 
 * @author pierr
 */
public class CelluleLumineuse {

    private boolean etat; //si la lumiere est allumée le booléen prend la valeur de True sinon c'est False

    /**
     * Elle permet lorsqu'une nouvelle cellule lumineuse est créée elle est
     * initialiser éteint (false)
     *
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * Cette méthode permet d'activer la cellule lumineuse en inversant son état
     * actuel
     */
    public void activerCellule() {
        if (etat == true) {
            this.etat = false;
        } else {
            this.etat = true;
        }
    }

    /**
     * Cette méthide permet d'éteindre la cellule en la mettant dans l'état
     * "éteindre" (false)
     */
    public void eteindreCellule() {
        if (etat == true) {
            this.etat = false;
        }
    }

    /**
     * Cette méthode vérifie si la cellule est actuellement éteinte. 
     *
     * @return Cela permet de déterminer l'état actuel de la cellule sans nécessairement consulter la variable "état"
     */
    public boolean estEteint() {
        if (this.etat == true) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Cette méthode renvoie l'état actuel de la cellule.
     *
     * @return Elle permet d'obtenir l'état courant de la cellule
     */
    public boolean getEtat() {
        if (this.etat == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cette méthode facilite la représentation visuelle de l'état de la cellule
     *
     * @return elle renvoie "X" quand l'état est allumée et "O" quand l'état est éteinte
     */
    @Override
    public String toString() {
        if (this.etat == true) {
            return "X";
        } else {
            return "O";
        }
    }
}
