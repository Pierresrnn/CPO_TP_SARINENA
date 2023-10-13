/*
SARINENA, TDC , relation, 13/10/2023
 */
package tp2_relation_1_sarinena;

/**
 *
 * @author pierr
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    String Proprietaire = "NULL" ;

    public Voiture(String Modele, String Marque, int PuissanceCV, String Proprietaire) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire = Proprietaire;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + ", Proprietaire=" + Proprietaire + '}';
    }
}
