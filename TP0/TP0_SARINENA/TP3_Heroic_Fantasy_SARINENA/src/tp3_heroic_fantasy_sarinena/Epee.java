/*
SARINENA, TDC , HEROIC FANTASY, 18/10/2023
 */
package tp3_heroic_fantasy_sarinena;

/**
 *
 * @author pierr
 */
public class Epee extends Arme {
    
    int finesse;  

    public Epee(String nom,int niveau_attaque,int finesse){
         super(nom,niveau_attaque);
         if (finesse<100){
            this.finesse=finesse;            
         }else{
            this.finesse=0;
         }
    }

  

    
}
