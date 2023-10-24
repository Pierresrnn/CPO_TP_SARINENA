/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package Personngaes;

import Armes.Arme;
import java.util.ArrayList;

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

    public String nom() {
        return nom;
    }

    public int niveau_de_vie() {
        return niveau_de_vie;
    }

    String nouvelle_arme;

    ArrayList<Arme> inventaire = new ArrayList<Arme>();

    public void ajouterArme(Arme nouvelleArme) {
        if (inventaire.size() < 5) {
            inventaire.add(nouvelleArme);
            System.out.println(nouvelleArme.getNom() + " a été ajouté à l'inventaire de " + nom);
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes dans son inventaire");
        }
    }

    Arme arme_actuelle = null;

    public Arme getArme_actuelle() {
        return arme_actuelle;
    }

    public void equiperArme(String nom_arme) {
        for (Arme arme : inventaire) {
            if (arme != null && arme.nouvelle_arme().equals(nom_arme)) {
                arme_en_Main = arme;
                System.out.println("Arme " + nomArme + " équipée avec succès.");
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'a pas été trouvée dans l'inventaire.");
    }

    @Override
    public String toString() {
        return "Personnage: " + "nom= " + nom + ", niveau_de_vie= " + niveau_de_vie;
    }
}
