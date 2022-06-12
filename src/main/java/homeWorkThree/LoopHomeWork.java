package homeWorkThree;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(faktorialaVertiba(3));
        ievadiPin();
        irPirmskaitlis(12);


        //1.uzdevums

            System.out.println("Lūdzu ievadiet veselus skaitļus");
            int summa = 0;
            while (summa < 100) {
                int ievaditais = scaner.nextInt();
                summa = summa + ievaditais;
                System.out.println("Šobrīd ievadīto skaitļu summa ir " + summa);
            }
            System.out.println("Ievadīto skaitļu summa ir " + summa);
            System.out.println("GATAVS");


        //3.uzdevums
        int[] intMasivs = {2, 7, 56, 25, 887, 78, 85, 12, 4, 7};
        String[] stringMasivs = {"Pēteris", "Anna", "Jāzeps", "Marija", "Santa", "Kristofs"};
        char[] charMasivs = {'F', 'G', 'L', 'S', 'T', 'K'};

        //While metode
        System.out.println("Izmantojot while metodi, izdrukā Int masīvu.");
        int pecKartas = 0;
        while (pecKartas < intMasivs.length) {
            System.out.print(" , " + intMasivs[pecKartas]);
            pecKartas++;
        }
        System.out.println();

        System.out.println("Izmantojot while metodi, izdrukā String masīvu.");
        int a = 0;
        while (a < stringMasivs.length) {
            System.out.print(stringMasivs[a] + " , ");
            a++;
        }
        System.out.println();

        System.out.println("Izmantojot while metodi, izdrukā Char masīvu.");
        int b = 0;
        while (b < charMasivs.length) {
            System.out.print(charMasivs[b] + " , ");
            b++;
        }
        System.out.println();

        //do while metode
        System.out.println("Izmantojot do while metodi, izdrukā Int masīvu.");
        int c = 0;
        do {
            System.out.print(intMasivs[c] + " , ");
            c++;
        } while (c < intMasivs.length);
        System.out.println();

        System.out.println("Izmantojot do while metodi, izdrukā Strin masīvu.");
        int d = 0;
        do {
            System.out.print(stringMasivs[d] + " , ");
            d++;
        } while (d < stringMasivs.length);
        System.out.println();

        System.out.println("Izmantojot do while metodi, izdrukā Char masīvu.");
        int e = 0;
        do {
            System.out.print(charMasivs[e] + " , ");
            e++;
        } while (e < charMasivs.length);
        System.out.println();

        //for loop metode
        System.out.println("Izmantojot for loop metodi, izdrukā Int masīvu.");
        for (int i = 0; i < intMasivs.length; i++) {
            System.out.print(intMasivs[i] + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for loop metodi, izdrukā String masīvu.");
        for (int i = 0; i < stringMasivs.length; i++) {
            System.out.print(stringMasivs[i] + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for loop metodi, izdrukā char masīvu.");
        for (int i = 0; i < charMasivs.length; i++) {
            System.out.print(charMasivs[i] + " , ");
        }
        System.out.println();

        //for each metode
        System.out.println("Izmantojot for each metodi, izdrukā Int masīvu.");
        for (int izprinte : intMasivs
        ) {
            System.out.print(izprinte + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for each metodi, izdrukā String masīvu.");
        for (String izprinte : stringMasivs
        ) {
            System.out.print(izprinte + " , ");
        }
        System.out.println();

        System.out.println("Izmantojot for each metodi, izdrukā char masīvu.");
        for (char izprinte : charMasivs
        ) {
            System.out.print(izprinte + " , ");
        }
        System.out.println();


        //4.uzdevums

        int[] simtnieks = new int[100];
        int f = 2;
        for (int i = 0; i < simtnieks.length; i++) {
            simtnieks[i] = f;
            f = f + 2;
            System.out.print(simtnieks[i] + " , ");
        }

    }

        //5. uzdevums

        public static int faktorialaVertiba (int skaitlis){
            int faktorials = 1;
            for (int i = 1; i < skaitlis; i++) {
                faktorials = faktorials * i;
            }
            return faktorials;
        }

    //6.uzdevums
    public static void ievadiPin (){
        Scanner scaner= new Scanner(System.in);
        int pareizsPin= 1111;
        int meginajums= 0;
        while (meginajums<3) {
            System.out.println("Lūdzu ievadiet Pin kodu");
            int ievaditais = scaner.nextInt();
            if (pareizsPin == ievaditais) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (pareizsPin != ievaditais) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
                meginajums++;
            } else {
                System.out.println("Atvainojiet, bet jūs esat bloķēts!");
            }


        }

    }

    //2.uzdevums

    public static void irPirmskaitlis (int skaitlis) {
        boolean irPirmskaitlis = true;
        int i = 2;
        while (i <= skaitlis / 2) {
            if (skaitlis % 1 == 0) {
                irPirmskaitlis = false;
                break;
            } else {
                i++;
            }
        } System.out.println(skaitlis + " pirmskaitlis " + irPirmskaitlis);
    }

}
