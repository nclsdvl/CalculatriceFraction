package Nico;
import Nico.Fraction;
import Nico.ReductionPGCD;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Fraction.CalculFraction();
        ReductionPGCD.CalculPGCD( Fraction.getNumerateurSoluce(), Fraction.getDenominateurSoluce());
    }
}





