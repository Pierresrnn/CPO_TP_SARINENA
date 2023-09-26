/*
SARINENA, TDC , manipNombreInt, 26/09/2023
 */
package tp1_manipnombresint_sarinena;

import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class TP1_manipNombresInt_SARINENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // entrer les nombres par l'utilisation
        System.out.println("Ecrit un premiere entier");
        int nombre1 = sc.nextInt();
        System.out.println("Ecrit un deuxieme entier");
        int nombre2 =sc.nextInt();
        // afficher les nombres entrés
        System.out.println("Le premier nombre est :"+ nombre1);
        System.out.println("Le deuxieme nombre est :"+ nombre2);
        // réalisation de la somme des deux nombres
        int somme = nombre1 + nombre2;        
        System.out.println("La somme des deux nombres est :" + somme);
        // réalisation de la différence des deux nombres
        int difference = nombre1 - nombre2;
        System.out.println("La difference des deux nombres est :" + difference);
        // réalisation du produit des deux nombres
        int produit = nombre1 * nombre2;
        System.out.println("Le produit des deux nombres est :" + produit);
        // réalisation du quotient des deux nombres
        int quotient = nombre1 / nombre2;
        // réalisation du modulo pour trouver le reste des deux nombres
        int modulo = nombre1 % nombre2;
        System.out.println("Le quotient des deux nombres est :" + quotient);
        System.out.println("Le reste du quotient des deux nombres est :" + modulo);
        
    }
    
}
