/*
SARINENA, TDC , convertisseur, 26/09/2023
 */
package tp1_convertisseur_sarinena;

import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class TP1_convertisseur_SARINENA {
    // les différentes formules pour la convertion des temperature

    public static double CelciusVersKelvin (double tCelcius) {
       double tKelvin = tCelcius + 273.15;
       return tKelvin;
    }
    public static double KelvinVersCelcius (double tKelvin){
        double tCelcius = tKelvin -273.15;
        return tCelcius;
    }
    public static double FarenheitVersCelcius(double tFarenheit){
        double tCelcius = (tFarenheit -32) * 5/9;
        return tCelcius;
    }
    public static double CelciusVersFarenheit(double tCelcius){
        double tFarenheit = (tCelcius *9/5) +32;
        return tFarenheit;
    }
    public static double KelvinVersFarenheit(double tKelvin){
        double tCelcius = KelvinVersCelcius (tKelvin);
        double tFarenheit = CelciusVersFarenheit(tCelcius);
        return tFarenheit;
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        double tCelcius = FarenheitVersCelcius (tFarenheit);
        double tKelvin = CelciusVersKelvin(tCelcius);
        return tKelvin;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur");
        double reel = sc.nextDouble();
        System.out.println("la valeure reelle entrée est :" + reel);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :1)De Celcius Vers Kelvin \n 2) De Kelvin Vers Celcius \n 3) De Farenheit Vers Celcius \n 4) De Celcius Vers Farenheit \n 5) De Kelvin Vers Farenheit \n 6) De Farenheit Vers Kelvin");
        int choix = sc.nextInt();
        while (choix <1 || choix> 6){
            System.out.println("resaisissez un nombre valide:");
            choix= sc.nextInt();     
        }
        double resultat;
        if (choix==1){
            resultat=CelciusVersKelvin (reel);
            System.out.println("la convertion donne "+ resultat+"Kelvin");
        }else if (choix==2){
            resultat=KelvinVersCelcius (reel);
            System.out.println("la convertion donne "+ resultat+" Celcius");
        }else if (choix==3){
            resultat=FarenheitVersCelcius(reel);
            System.out.println("la convertion donne "+ resultat+" Celcius");
        }else if (choix==4){
            resultat=CelciusVersFarenheit(reel);
            System.out.println("la convertion donne "+ resultat+" Farenheit");
        }else if (choix==5){
            resultat=KelvinVersFarenheit(reel);
            System.out.println("la convertion donne "+ resultat+" Farenheit");
        }else if (choix==6){
            resultat= FarenheitVersKelvin(reel);
            System.out.println("la convertion donne "+ resultat+" Kelvin");
        }   
    }    
}
