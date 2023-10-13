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
        Tartiflette assiette15 = new Tartiflette(500);
        Tartiflette assiette16 = new Tartiflette(600);
        Tartiflette assiette17= assiette16; //on a crée 3 tartiflettes réellement mais 2 et 3 sont des tartiflettes identiques en terme de calories mais c'est deux entités différentes
        System.out.println("nb de calories de Assiette 2 : " + assiette16.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette17.nbCalories);
        Tartiflette temp = assiette15;
        assiette15 = assiette16;
        assiette16 = temp;
        System.out.println("nb de calories de Assiette 1 : " + assiette15.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette16.nbCalories);
        //on ne peut pas référencer un autre type objet qui n'a aucun rapport avec celui qu'il référence 
        /*
        Moussaka assiette666 = assiette1;
        Moussaka assiette667 = new Tartiflette();
        */
        Moussaka[] assiette = new Moussaka[10];
        for (int i=0;i<assiette.length;i=i+1){
            assiette[i]= new Moussaka(i);
            System.out.println(assiette[i]);
        }
    }

}
