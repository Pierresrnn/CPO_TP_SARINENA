/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package Personngaes;

/**
 *
 * @author pierr
 */
public class Guerrier extends Personnage{
    
    boolean cheval;
    
    public Guerrier(String nom, int niveau_de_vie) {
        super(nom, niveau_de_vie);
    }

    public Guerrier(String nom, int niveau_de_vie,boolean cheval) {
        super(nom, niveau_de_vie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
}
