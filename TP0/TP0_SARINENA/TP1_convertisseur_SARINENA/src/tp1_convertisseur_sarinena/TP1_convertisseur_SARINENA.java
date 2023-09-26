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
        System.out.println("Ecrit un premiere nombre");
        double reel = sc.nextDouble();
        System.out.println("la valeure reelle entrée est :" + reel);
        double temperature_kelvin= reel + 273.15;
        System.out.println("la temperature après la convetion en Kelvin est :" + temperature_kelvin);
        
        
        
        
        
        
    }
    
}
