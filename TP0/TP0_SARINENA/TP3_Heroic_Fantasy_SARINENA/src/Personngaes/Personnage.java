/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package Personngaes;

/**
 *
 * @author pierr
 */
public abstract class Personnage {
    
    String nom;
    int niveau_de_vie;
    boolean comfirme;

    public Personnage(String nom, int niveau_de_vie, boolean comfirme) {
        this.nom = nom;
        this.niveau_de_vie = niveau_de_vie;
        this.comfirme = comfirme;
    }

    
    public Personnage(String nom, int niveau_de_vie) {
        this.nom = nom;
        this.niveau_de_vie = niveau_de_vie;
    }

    public String nom(){
        return nom;
    }
    
    public int niveau_de_vie(){
        return niveau_de_vie;
    }
    
    @Override
    public String toString() {
        return "Personnage: " + "nom= " + nom + ", niveau_de_vie= " + niveau_de_vie;
    }  
}
