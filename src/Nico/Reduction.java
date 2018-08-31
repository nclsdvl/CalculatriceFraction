package Nico;

import java.util.Scanner;

public class Reduction {
    public static int numerateurSoluce = Fraction.getNumerateurSoluce();
    public static int denominateurSoluce = Fraction.getDenominateurSoluce();
    public static int PGCD = ReductionPGCD.getPGCD();
    public static int choixReduction;

    public static int getNumerateurSoluce() {
        return numerateurSoluce;
    }

    public static void setNumerateurSoluce(int numerateurSoluce) {
        Reduction.numerateurSoluce = numerateurSoluce;
    }

    public static int getDenominateurSoluce() {
        return denominateurSoluce;
    }

    public static void setDenominateurSoluce(int denominateurSoluce) {
        Reduction.denominateurSoluce = denominateurSoluce;
    }

    public static int getPGCD() {
        return PGCD;
    }

    public static void setPGCD(int PGCD) {
        Reduction.PGCD = PGCD;
    }



    public static String CalculFormeReduite() {
        if (PGCD == 1){
            System.out.println("cette fraction ne peut etre réduite");
        }
        else {
            System.out.println("Voulez-vous reduire cette fraction?");
            System.out.println("Taper 1 pour oui \nTaper 2 pour non");
            Scanner sc1 = new Scanner(System.in);
            choixReduction = sc1.nextInt();

            if (choixReduction <= 0 || choixReduction >2) {
                System.out.println("On avait dit d'entrer 1 ou 2!!!");
                System.out.println("arret du programme...");
                return "";
            }

            else if (choixReduction == 1){
                numerateurSoluce /= PGCD;
                denominateurSoluce /= PGCD;

                System.out.println("La solution réduite est : "+ numerateurSoluce +"/"+denominateurSoluce);

            }
            else {
                System.out.println("Merci au revoir");}
        }
        return "";
    }


}
