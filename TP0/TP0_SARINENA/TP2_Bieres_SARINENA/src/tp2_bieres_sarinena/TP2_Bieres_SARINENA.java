/*
SARINENA, TDC , Bieres, 06/10/2023
 */
package tp2_bieres_sarinena;

/**
 *
 * @author pierr
 */
public class TP2_Bieres_SARINENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        deuxBiere.lireEtiquette();        
            
        
        
      
    }

}
