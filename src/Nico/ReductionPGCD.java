package Nico;


public class ReductionPGCD {

    public static int numerateurSoluce = Fraction.getNumerateurSoluce();
    public static int denominateurSoluce = Fraction.getDenominateurSoluce();
    public static int PGCD = 1;
    public static int swap;



    public ReductionPGCD(int numerateurSoluce, int denominateurSoluce) {
        this.numerateurSoluce = numerateurSoluce;
        this.denominateurSoluce = denominateurSoluce;


    }

    public static int getPGCD() {
        return PGCD;
    }

    public static int CalculPGCD(int numerateurSoluce, int denominateurSoluce) {

        try {

            int X =numerateurSoluce/denominateurSoluce;

        } catch (ArithmeticException e) {


            return 0;
        }

        int modulo_A_B = numerateurSoluce % denominateurSoluce;
        int modulo_B_A = denominateurSoluce % numerateurSoluce;
        while ((modulo_A_B != 0) || (modulo_B_A != 0) || (modulo_A_B != 1) || (modulo_B_A != 1)){

            if (numerateurSoluce >= denominateurSoluce) {
                if (modulo_A_B == 0) {

                    PGCD = denominateurSoluce;
                    System.out.println( "le PGCD = "+PGCD);
                    return PGCD;
                } else {
                    swap = denominateurSoluce;
                    numerateurSoluce = swap;
                    denominateurSoluce = modulo_A_B;

                }
            }

            else {
                if (numerateurSoluce < denominateurSoluce) {
                    if (modulo_B_A == 0) {
                        PGCD = numerateurSoluce;
                        System.out.println( "le PGCD = "+PGCD);
                        return PGCD;
                    } else {
                        swap = numerateurSoluce;
                        denominateurSoluce = numerateurSoluce;
                        numerateurSoluce = modulo_B_A;
                    }

                    }
                }
        }

        System.out.println( "le PGCD = "+PGCD);
        return PGCD;
    }
}

