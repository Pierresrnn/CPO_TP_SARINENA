/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package Personngaes;

/**
 *
 * @author pierr
 */
public class Magicien extends Personnage {
    
    boolean comfirme;
    
    public Magicien(String nom, int niveau_de_vie) {
        super(nom, niveau_de_vie);
    }

    public Magicien(String nom, int niveau_de_vie,boolean comfirme) {
        super(nom, niveau_de_vie);
        this.comfirme = comfirme;
    }

    public void setComfirme(boolean comfirme) {
        this.comfirme = comfirme;
    }
    
    
    
    
}
