/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package tp3_heroic_fantasy_sarinena;

import Personngaes.Magicien;
import Personngaes.Guerrier;
import Personngaes.Personnage;
import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author pierr
 */
public class TP3_Heroic_Fantasy_SARINENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee_1 = new Epee("Excalibur", 7, 5);
        Epee epee_2 = new Epee("Durandal", 4, 7);
        /*
        System.out.println(epee_1);
        System.out.println(epee_2);
         */
        Baton baton_1 = new Baton("Chene", 4, 5);
        Baton baton_2 = new Baton("Charme", 5, 6);
        /*
        System.out.println(baton_1);
        System.out.println(baton_2);
         */
        ArrayList<Arme> Tab = new ArrayList<Arme>();
        Tab.add(epee_1);
        Tab.add(epee_2);
        Tab.add(baton_1);
        Tab.add(baton_2);

//Permet d'afficher toute les valeur du tableau
        int taille = Tab.size(); //permet de connaitre la taille du tableau dynamique
        for (int i = 0; i < taille; i++) {
            Arme valeur = Tab.get(i);
            System.out.println(valeur);
        }
       
        Magicien magicien_1 = new Magicien("Gandalf", 65, true);
        Magicien magicien_2 = new Magicien("Garcimore", 44, false);
/* 
        System.out.println(magicien_1);
        System.out.println(magicien_2);
*/
        Guerrier guerrier_1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier_2 = new Guerrier("Lannister", 45, true);
/*        
        System.out.println(guerrier_1);
        System.out.println(guerrier_2);
*/
        ArrayList<Personnage> Tab_2 = new ArrayList<Personnage>();
        Tab_2.add(magicien_1);
        Tab_2.add(magicien_2);
        Tab_2.add(guerrier_1);
        Tab_2.add(guerrier_2);

//Permet d'afficher toute les valeurs du deuxieme tableau
        int taille_2 = Tab_2.size(); //permet de connaitre la taille du tableau dynamique
        for (int i = 0; i < taille_2; i++) {
            Personnage valeur_2 = Tab_2.get(i);
            System.out.println(valeur_2);
        }
                
    }

}
