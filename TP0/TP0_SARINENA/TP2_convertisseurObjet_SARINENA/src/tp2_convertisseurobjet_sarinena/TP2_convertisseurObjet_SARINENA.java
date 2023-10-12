/*
SARINENA, TDC , convetisseurObjet, 12/10/2023
 */
package tp2_convertisseurobjet_sarinena;

import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class TP2_convertisseurObjet_SARINENA {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur");
        double reel = sc.nextDouble();
        System.out.println("la valeure reelle entrée est :" + reel);
        
        Convertisseur convertisseur_1=new Convertisseur();
        Convertisseur convertisseur_2= new Convertisseur();
        
        double farenheit_1=convertisseur_1.CelciusVersFarenheit(reel);
        double kelvin_1=convertisseur_1.CelciusVersKelvin(reel);
        
        double celcius_2=convertisseur_2.KelvinVersCelcius(reel);
        double kelvin_2=convertisseur_2.CelciusVersKelvin(reel);
        double farenheit_2=convertisseur_2.CelciusVersFarenheit(reel);
        
        System.out.println(  convertisseur_1);
        System.out.println( convertisseur_2);
        
        Convertisseur convertisseur_3= new Convertisseur();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :1)De Celcius Vers Kelvin \n 2) De Kelvin Vers Celcius \n 3) De Farenheit Vers Celcius \n 4) De Celcius Vers Farenheit \n 5) De Kelvin Vers Farenheit \n 6) De Farenheit Vers Kelvin");
        int choix = sc.nextInt();
        while (choix < 1 || choix > 6) {
            System.out.println("resaisissez un nombre valide:");
            choix = sc.nextInt();
        }
        
        if (choix == 1) {
            System.out.println("la convertion donne " + convertisseur_3.CelciusVersKelvin(reel) + "Kelvin");
        } else if (choix == 2) {
            System.out.println("la convertion donne " + convertisseur_3.KelvinVersCelcius(reel) + " Celcius");
        } else if (choix == 3) {
            System.out.println("la convertion donne " +convertisseur_3.FarenheitVersCelcius(reel)+ " Celcius");
        } else if (choix == 4) {
            System.out.println("la convertion donne " +convertisseur_3.CelciusVersFarenheit(reel)+ " Farenheit");
        } else if (choix == 5) {
            System.out.println("la convertion donne " +convertisseur_3.KelvinVersFarenheit(reel)+ " Farenheit");
        } else if (choix == 6) {
            System.out.println("la convertion donne " +convertisseur_3.FarenheitVersKelvin(reel)+ " Kelvin");
        }
    }
}
