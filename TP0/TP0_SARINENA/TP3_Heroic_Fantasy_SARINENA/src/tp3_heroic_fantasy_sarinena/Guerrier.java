/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package tp3_heroic_fantasy_sarinena;

/**
 *
 * @author pierr
 */
public class Guerrier extends Personnage{
    
    boolean cheval;
    
    public Guerrier(String nom, int niveau_de_vie) {
        super(nom, niveau_de_vie);
    }

    public Guerrier(boolean cheval, String nom, int niveau_de_vie) {
        super(nom, niveau_de_vie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
}
