package Nico;

    import java.util.Scanner;

    public class Fraction {
        public static int  numerateur1, numerateur2;
        public static int denominateur1, denominateur2;
        public static int operateur;
        public static int numerateurSoluce;
        public static int denominateurSoluce;
        public static String Soluce = numerateurSoluce + "/" + denominateurSoluce;

        ///////////////////////////////////////////////////////////////////////
        ////////                CONSTRUCTEUR                          /////////
        ///////////////////////////////////////////////////////////////////////
        public Fraction(int numerateur1, int numerateur2, int numerateurSoluce, int denominateur1, int denominateur2, int denominateurSoluce, String soluce) {
            this.numerateur1 = numerateur1;
            this.numerateur2 = numerateur2;
            this.numerateurSoluce = numerateurSoluce;
            this.denominateur1 = denominateur1;
            this.denominateur2 = denominateur2;
            this.denominateurSoluce = denominateurSoluce;
        }

        /////////////////////////////////////////////////////////
        ////////          Getters           ////////////////////
        ////////          Setters           ///////////////////
        //////////////////////////////////////////////////////


        public static int getNumerateur1() {
            return numerateur1;
        }

        public static void setNumerateur1(int numerateur1) {
            Fraction.numerateur1 = numerateur1;
        }

        public static int getNumerateur2() {
            return numerateur2;
        }

        public static void setNumerateur2(int numerateur2) {
            Fraction.numerateur2 = numerateur2;
        }

        public static int getDenominateur1() {
            return denominateur1;
        }

        public static void setDenominateur1(int denominateur1) {
            Fraction.denominateur1 = denominateur1;
        }

        public static int getDenominateur2() {
            return denominateur2;
        }

        public static void setDenominateur2(int denominateur2) {
            Fraction.denominateur2 = denominateur2;
        }

        public static int getOperateur() {
            return operateur;
        }

        public static void setOperateur(int operateur) {
            Fraction.operateur = operateur;
        }

        public static int getNumerateurSoluce() {
            return numerateurSoluce;
        }

        public static void setNumerateurSoluce(int numerateurSoluce) {
            Fraction.numerateurSoluce = numerateurSoluce;
        }

        public static int getDenominateurSoluce() {
            return denominateurSoluce;
        }

        public static void setDenominateurSoluce(int denominateurSoluce) {
            Fraction.denominateurSoluce = denominateurSoluce;
        }

        public static String getSoluce() {
            return Soluce;
        }

        public static void setSoluce(String soluce) {
            Soluce = soluce;
        }

        /////////////////////////////////////////////////////////
        ////////          METHODES          ////////////////////
        ///////////////////////////////////////////////////////

        public static String CalculFraction() {

            System.out.println("Veuillez entrer votre numerateur");
            Scanner sc1 = new Scanner(System.in);
            numerateur1 = sc1.nextInt();

            System.out.println("Veuillez entrer votre denominateur");
            Scanner sc2 = new Scanner(System.in);
            denominateur1 = sc1.nextInt();


            try { int X = (numerateur1/denominateur1);}
            catch (ArithmeticException e) {
                System.out.println("Division par zéro !!! \nArret du programme");
                return "";}






            System.out.println("Veuillez entrer : \n 1 pour additionner \n 2 pour soustraire \n 3 pour multiplier \n 4 pour diviser");
            Scanner sc3 = new Scanner(System.in);
            operateur = sc1.nextInt();

            if ((operateur <= 0) || (operateur >4)){
                System.out.println("Je n'ai pas compris votre choix! Merci d'entrer un chiffre entre 1 et 4 !!!!!");
                System.out.println("Il ne vous reste plus qu'a relancer le programme ! ");
                return "";
            }






            System.out.println("Veuillez entrer votre numerateur");
            Scanner sc4 = new Scanner(System.in);
            numerateur2 = sc1.nextInt();

            System.out.println("Veuillez entrer votre denominateur");
            Scanner sc5 = new Scanner(System.in);
            denominateur2 = sc1.nextInt();
            Soluce = numerateurSoluce + "/" + denominateurSoluce;

            try {

                int X = numerateur2/denominateur2;

            } catch (ArithmeticException e) {

                System.out.println("Division par zéro !!! \nArret du programme");
                return "";
            }

            switch (operateur) {


                case 1:
                    if (denominateur1 == denominateur2) {
                        numerateurSoluce = numerateur1 + numerateur2;
                        denominateurSoluce = denominateur1;
                        System.out.println("l'operataion à effectuer est : (" + numerateur1 + "/" + denominateur1 + ")+(" + numerateur2 + "/" + denominateur2 + ")");
                        System.out.println("le resultat est : " + numerateurSoluce + "/" + denominateurSoluce);

                    } else {
                        denominateurSoluce = denominateur1 * denominateur2;
                        numerateurSoluce = (numerateur1 * denominateur2) + (numerateur2 * denominateur1);
                        System.out.println("l'operataion à effectuer est : (" + numerateur1 + "/" + denominateur1 + ")+(" + numerateur2 + "/" + denominateur2 + ")");
                        System.out.println("le resultat est : " + numerateurSoluce + "/" + denominateurSoluce);
                    }
                    break;


                case 2:
                    if (denominateur1 == denominateur2) {
                        numerateurSoluce = numerateur1 - numerateur2;
                        denominateurSoluce = denominateur1;

                        System.out.println("l'operataion à effectuer est : (" + numerateur1 + "/" + denominateur1 + ")-" + numerateur2 + "/" + denominateur2);
                        System.out.println("le resultat est : " + numerateurSoluce + "/" + denominateurSoluce);
                    } else {
                        denominateurSoluce = denominateur1 * denominateur2;
                        numerateurSoluce = (numerateur1 * denominateur2) - (numerateur2 * denominateur1);
                        System.out.println("l'operataion à effectuer est : (" + numerateur1 + "/" + denominateur1 + ")-(" + numerateur2 + "/" + denominateur2 + ")");
                        System.out.println("le resultat est : " + numerateurSoluce + "/" + denominateurSoluce);

                    }
                    break;

                case 3:
                    numerateurSoluce = numerateur1 * numerateur2;
                    denominateurSoluce = denominateur1 * denominateur2;
                    System.out.println("l'operataion à effectuer est : (" + numerateur1 + "/" + denominateur1 + ") X (" + numerateur2 + "/" + denominateur2 + ")");
                    System.out.println("le resultat est : " + numerateurSoluce + "/" + denominateurSoluce);
                    break;

                case 4:
                    numerateurSoluce = numerateur1 * denominateur2;
                    denominateurSoluce = denominateur1 * numerateur2;
                    System.out.println("l'operataion à effectuer est : (" + numerateur1 + "/" + denominateur1 + ")/(" + numerateur2 + "/" + denominateur2 + ")");
                    System.out.println("le resultat est : " + numerateurSoluce + "/" + denominateurSoluce);
                    break;
            }


            return Soluce;
        }
    }