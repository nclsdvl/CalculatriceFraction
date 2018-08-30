package Nico;


public class ReductionPGCD {

    public static int numerateurSoluce = Fraction.getNumerateurSoluce();
    public static int denominateurSoluce = Fraction.getDenominateurSoluce();


    public static int PGCD;
    public static int swap;

    public ReductionPGCD(int numerateurSoluce, int denominateurSoluce) {
        this.numerateurSoluce = numerateurSoluce;
        this.denominateurSoluce = denominateurSoluce;
    }

    public static int CalculPGCD( int numerateurSoluce, int denominateurSoluce) {
        for (int i = 0; i < numerateurSoluce && i < denominateurSoluce; i++) {
            int modulo_A_B = numerateurSoluce % denominateurSoluce;
            int modulo_B_A = denominateurSoluce % numerateurSoluce;
            if (numerateurSoluce > denominateurSoluce) {
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

