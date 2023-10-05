/*
SARINENA, TDC , stats, 26/09/2023
 */
package tp1_stats_sarinena;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class TP1_stats_SARINENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tableau = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir un entier m : ");
        int m = sc.nextInt();
        Random alea = new Random();
        for (int i = 0; i < m; i = 1 + i) {
            int randomNumber = alea.nextInt(6);  
            tableau[randomNumber]++;
        }
        //for (int i=0;i<6;i=1+i){
            //System.out.println(tableau[i]);
        for (int i = 0; i < 6; i++) {
            double nombre_pourcen = (double) tableau[i] / m * 100;
            System.out.println(nombre_pourcen);
        }
    }

}
