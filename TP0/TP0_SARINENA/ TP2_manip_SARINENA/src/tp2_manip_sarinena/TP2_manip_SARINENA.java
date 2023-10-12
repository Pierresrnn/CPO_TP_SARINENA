/*
SARINENA, TDC , manip, 12/10/2023
 */
package tp2_manip_sarinena;

/**
 *
 * @author pierr
 */
public class TP2_manip_SARINENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; //on a crée 3 tartiflettes réellement mais 2 et 3 sont des tartiflettes identiques en terme de calories mais c'est deux entités différentes
        System.out.println("nb de calories de Assiette 2 : "+ assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+ assiette3.nbCalories);
    }

}
