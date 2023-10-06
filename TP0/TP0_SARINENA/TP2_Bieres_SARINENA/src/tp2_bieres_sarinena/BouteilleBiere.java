/*
SARINENA, TDC , BouteilleBiere, 06/10/2023
 */
package tp2_bieres_sarinena;

/**
 *
 * @author pierr
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    public void Décapsuler() {
        if (ouverte == false) {
            ouverte = true;
            System.out.println("La biere est ouverte");
        } else {
            System.out.println("Erreur biere déjà ouverte");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres)Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui \n";
        } else {
            chaine_a_retourner += "non \n";
        }
        return chaine_a_retourner ;
    }
}
