/*
SARINENA, TDC , calculator, 25/09/2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int operateur = 0;
        int operande1;
        int operande2;
        double resultat;
        System.out.println("Please enter the operator:\n 1) add \n 2) substract \n 3) multiply \n 4) divide) \n 5) modulo");
        Scanner sc = new Scanner(System.in);
        while (operateur<1 || operateur>5){
            System.out.println("\n Entrer un nombre correspondant a la bonne operation compris entre 1 et 5:");
            operateur=sc.nextInt(); // On demande a sc de donner le prochain entier
        }
        System.out.println("\n Entrer le premier nombre de l operation :");
        operande1=sc.nextInt();
        System.out.println("\n Entrer le deuxieme nombre de l operation :");
        operande2=sc.nextInt();
        if (operateur==1){
            resultat=operande1 + operande2;
            System.out.println("le resultat de l addition est:" + resultat);
        }else if ( operateur==5 && operande2 != 0){
            resultat=operande1 % operande2;
            System.out.println("le resultat du reste de la division est:" + resultat);
        }else if ( operateur==3){
            resultat=operande1 * operande2;
            System.out.println("le resultat de la multiplication est:" + resultat);
        }else if ( operateur==4 && operande2 != 0){
            resultat=operande1 / operande2;
            System.out.println("le resultat de la division est:" + resultat);
        }else if (operateur ==2){
            resultat=operande1 - operande2;
            System.out.println("le resultat de la soustraction est:" + resultat);
        }else{
            System.out.println("\n Entrer le deuxieme nombre de l operation en evitant de mettre un zero recommencer");
        }
    }
    
}
