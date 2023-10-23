/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package tp3_heroic_fantasy_sarinena;

/**
 *
 * @author pierr
 */
public class Personnage {
    
    String nom;
    int niveau_de_vie;

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
        return "Personnage{" + "nom=" + nom + ", niveau_de_vie=" + niveau_de_vie + '}';
    }  
}
