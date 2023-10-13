/*
SARINENA, TDC , relation, 13/10/2023
 */
package tp2_relation_1_sarinena;

/**
 *
 * @author pierr
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[]  liste_voitures;



    public Personne(String nom, String prenom, int nbVoitures, Voiture[] liste_voitures) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = nbVoitures;
        this.liste_voitures = liste_voitures;
    }
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", nbVoitures=" + nbVoitures + ", liste_voitures=" + liste_voitures + '}';
    }
}
