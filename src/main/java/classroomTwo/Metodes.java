package classroomTwo;

import java.util.Scanner;

public class Metodes {
    public static void main(String[] args) {

        System.out.println("sākās koda izp");
        checkPersonAge();
        checkPersonPension();
        checkPersonPension2(65, 'v');
        checkPersonPension2(15, 's');
        checkPersonPension2(40, 'v');
        System.out.println("beidzās koda izp");
        int manaKvadrataLaukums = aprekinatKvadrataLaukumu(5);
        System.out.println("Kvadrata lauikuims ir: " + manaKvadrataLaukums);

    }

     Scanner scanner= new Scanner(System.in);
    static int aprekinatKvadrataLaukumu(int mala){
        int laukums = mala * mala;
        return laukums;
    }


        static void checkPersonAge() {
            System.out.println("sākās metodes izp");
            System.out.println("ievadiet vecumu");
            Scanner scanner = new Scanner(System.in);
            int vecumsTris = scanner.nextInt();
            if (vecumsTris >= 18) {
                System.out.println("Cilvēks drīkst balsot");
            } else {
                System.out.println("Cilvēks nedrīkst balsot");
            }
            System.out.println("beidZās5 metodes izp");
        }
 static void checkPersonPension2(int vecums, char dzimums) {
     boolean drikstDotiesPensija = false;
     if (vecums >= 65 && dzimums == 'V') {
         drikstDotiesPensija = true;
     } else if (vecums >= 60 && dzimums == 'S') {
         drikstDotiesPensija = true;
     }

     if (drikstDotiesPensija) {
         System.out.println("Cilveks drikst doties pensija!");
     }


 }
    static void checkPersonPension() {
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (cilvekaVecums >= 60 && cilvekaDzimums == 'S') {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println("Cilveks drikst doties pensija!");
        }
    }

}


