/*
SARINENA, TDC , guessMyNumber, 26/09/2023
 */
package tp1_guessmynumber_sarinena;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class TP1_guessMyNumber_SARINENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choisir une difficultee : \n 1) Facile \n 2) Moyen \n 3) Difficile");
        int choix_difficulte = sc.nextInt();

        if (choix_difficulte == 1) {
            Random generateurAleat = new Random();
            int nb1 = generateurAleat.nextInt(100);
            System.out.println("saisissez un nombre compris entre 1 et 100");
            int nombre = sc.nextInt();
            while (nombre < 1 || nombre > 100) {
                System.out.println("saisissez un nombre compris entre 1 et 100");
                nombre = sc.nextInt();
            }
            if (nb1 < nombre) {
                System.out.println("Trop Grand");
            } else if (nombre == nb1) {
                System.out.println("Tu as trouvé le bon nombre");
            } else {
                System.out.println("Trop Petit");
            }
            int i = 0;
            while (nombre != nb1) {
                System.out.println("saisissez un nombre compris entre 1 et 100");
                nombre = sc.nextInt();
                while (nombre < 1 || nombre > 100) {
                    System.out.println("saisissez un nombre compris entre 1 et 100");
                    nombre = sc.nextInt();
                }
                if (nb1 < nombre) {
                    System.out.println("Trop Grand");
                } else if (nb1 > nombre) {
                    System.out.println("Trop Petit");
                }
                i = i + 1;
            }
            System.out.println("Gagne, le nombre a trouve etait " + nb1 + " nombre d essai est de " + i);
        } else if (choix_difficulte == 2) {
            Random generateurAleat = new Random();
            int nb1 = generateurAleat.nextInt(100);
            System.out.println("saisissez un nombre compris entre 1 et 100");
            int nombre = sc.nextInt();
            while (nombre < 1 || nombre > 100) {
                System.out.println("saisissez un nombre compris entre 1 et 100");
                nombre = sc.nextInt();
            }
            if (nb1 < nombre) {
                System.out.println("Trop Grand");
            } else if (nombre == nb1) {
                System.out.println("Tu as trouvé le bon nombre");
            } else {
                System.out.println("Trop Petit");
            }
            int i = 0;
            while (nombre != nb1) {
                System.out.println("saisissez un nombre compris entre 1 et 100");
                nombre = sc.nextInt();
                while (nombre < 1 || nombre > 100) {
                    System.out.println("saisissez un nombre compris entre 1 et 100");
                    nombre = sc.nextInt();
                }
                if (nb1 < nombre) {
                    System.out.println("Trop Grand");
                } else if (nb1 > nombre) {
                    System.out.println("Trop Petit");
                }
                i = i + 1;
            }
            System.out.println("Gagne, le nombre a trouve etait " + nb1 + " nombre d essai est de " + i);
        } else if (choix_difficulte == 3) {
            Random generateurAleat = new Random();
            int nb1 = generateurAleat.nextInt(100);
            System.out.println("saisissez un nombre compris entre 1 et 100");
            int nombre = sc.nextInt();
            while (nombre < 1 || nombre > 100) {
                System.out.println("saisissez un nombre compris entre 1 et 100");
                nombre = sc.nextInt();
            }
            if (nb1 < nombre) {
                System.out.println("Trop Grand");
            } else if (nombre == nb1) {
                System.out.println("Tu as trouvé le bon nombre");
            } else {
                System.out.println("Trop Petit");
            }
            int i = 0;
            while (nombre != nb1 && i!=3) {
                System.out.println("saisissez un nombre compris entre 1 et 100");
                nombre = sc.nextInt();
                while (nombre < 1 || nombre > 100) {
                    System.out.println("saisissez un nombre compris entre 1 et 100");
                    nombre = sc.nextInt();
                }
                if (nb1 < nombre) {
                    System.out.println("Trop Grand");
                } else if (nb1 > nombre) {
                    System.out.println("Trop Petit");
                }
                i = i + 1;
            }
            System.out.println("Gagne, le nombre a trouve etait " + nb1 + " nombre d essai est de " + i);
        }

    }

}
