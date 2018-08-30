package Nico;


public class ReductionPGCD {

    public static int numerateurSoluce = Fraction.getNumerateurSoluce();
    public static int denominateurSoluce = Fraction.getDenominateurSoluce();

    public static int modulo_B_A = denominateurSoluce % numerateurSoluce;
    public static int PGCD;
    public static int swap;

    public ReductionPGCD(int numerateurSoluce, int denominateurSoluce) {
        this.numerateurSoluce = numerateurSoluce;
        this.denominateurSoluce = denominateurSoluce;
    }

    public static int CalculPGCD( int numerateurSoluce, int denominateurSoluce) {
        for (int i = 0; i < numerateurSoluce && i < denominateurSoluce; i++) {
            int modulo_A_B = numerateurSoluce % denominateurSoluce;

            if (numerateurSoluce > denominateurSoluce && modulo_A_B == 0) {

                PGCD = denominateurSoluce;
            } else {
                swap = denominateurSoluce;
                numerateurSoluce = swap;
                denominateurSoluce = modulo_A_B;

            }

            if (numerateurSoluce < denominateurSoluce ||modulo_B_A == 0) {
                PGCD = numerateurSoluce;
            } else {
                denominateurSoluce = numerateurSoluce;
                numerateurSoluce = modulo_B_A;
            }
        }

        System.out.println( "le PGCD = "+PGCD);
        return PGCD;
    }
}

