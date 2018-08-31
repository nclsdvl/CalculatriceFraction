package Nico;

import static Nico.Reduction.CalculFormeReduite;

public class Main {


    public static void main(String[] args) {


        Fraction.CalculFraction();
        ReductionPGCD.CalculPGCD( Fraction.getNumerateurSoluce(), Fraction.getDenominateurSoluce());
        CalculFormeReduite();

    }
}





