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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0, "Dubuisson" );
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        System.out.println(uneBiere) ;
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxBiere.lireEtiquette();
        System.out.println(deuxBiere) ;
        
        BouteilleBiere troisBiere = new BouteilleBiere("Meteor", 5.4, "Metzger Haag");
        troisBiere.lireEtiquette();
        troisBiere.Décapsuler();
        System.out.println(troisBiere) ;
        
        BouteilleBiere quatreBiere = new BouteilleBiere("Desperados", 5.1, "Fischer");
        quatreBiere.lireEtiquette();
        quatreBiere.Décapsuler();
        System.out.println(quatreBiere) ;
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Kronenbourg", 4.2, "Calsberg");
        cinqBiere.lireEtiquette();
        System.out.println(cinqBiere) ;

    }

}
