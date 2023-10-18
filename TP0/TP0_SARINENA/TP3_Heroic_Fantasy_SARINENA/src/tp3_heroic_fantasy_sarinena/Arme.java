/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package tp3_heroic_fantasy_sarinena;

/**
 *
 * @author pierr
 */
public abstract class Arme {

    String nom;
    int niveau_attaque;

    public Arme(String nom, int niveau_attaque) {
        this.nom = nom;
        if (niveau_attaque<=100){
            this.niveau_attaque = niveau_attaque;
        }else{
            this.niveau_attaque=0;
        }
    }

    public int generer_niv_attaque(){
        return niveau_attaque;
    }

    public String nom(){
        return nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau_attaque=" + niveau_attaque + '}';
    }
    
 
}
