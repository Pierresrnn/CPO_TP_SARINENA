/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package tp3_heroic_fantasy_sarinena;

/**
 *
 * @author pierr
 */
public class Baton extends Arme {

    int age;

    public Baton(String nom, int niveau_attaque, int age) {
        super(nom, niveau_attaque);
    }

    public Baton(int age, String nom, int niveau_attaque) {
        super(nom, niveau_attaque);
        if (age < 100) {
            this.age = age;
        }else{
            this.age=0;
        }
    }
}
