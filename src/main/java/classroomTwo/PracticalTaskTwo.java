package classroomTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticalTaskTwo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu");
//        String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu");
//        int age = scanner.nextInt();
//        System.out.println(String.format("Mani sauc: %s", name));
//        System.out.println("Mani sauc:" + name);
//        System.out.println("Jūsu vecums ir:" + age);


//        System.out.println("Ievadiet lūdzu skaitli a");
//        int a = scanner.nextInt();
//        System.out.println("ievadiet lūdzu otro skaitli b");
//        int b = scanner.nextInt();
//        int summa = a+b;
//        System.out.println("Abu skaitļu summa ir:" + summa);


        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;
        //Lielāks >
        System.out.println(b > a); //true
        System.out.println(a > b); //false

        //Mazāks <
        System.out.println(a < b);//true
        System.out.println(b < a);//false

        // vienāds ==
        System.out.println(a == c);//true
        System.out.println(a == b);//false

        //nav vienāds !=
        System.out.println(a != b);//true
        System.out.println(a != c);//false

        //mazāks vienāds <= (vai nu mazāks, vai nu lielāks)
        System.out.println(a <= c);//true
        System.out.println(a <= b);//true

        //lielāks vienāds >=
        System.out.println(d >= b);

        int vecums = 18;
        boolean vaiDrigstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks var balsot?" + vaiDrigstBalsot);

        String name = "Ruta";
        String secondName = "Anna";
        boolean vaiVardiSakrit = (name.equals(secondName));
        System.out.println("vai vārdi sakrīt?" + vaiVardiSakrit);

        int e = 4;

        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = ((e < 5) || (e < 10));
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = (e < 5);
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = (!(e < 5));
        System.out.println(vaiIrPatiess);


        int vecumsDivi = 17;
        if (vecumsDivi >= 18) {
            System.out.println("Cilvēks drīgst balsot");
        } else {
            System.out.println("Cilvēks nedrīgst balsot!");
        }
        System.out.println("Koda turpinājums");


        System.out.println("Ievadi savu vecumu");
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīgst balsot!");
        } else {
            System.out.println("Nedrīgst balsot");
        }
        System.out.println("Koda turpinājums2");


//if- else- if- else
        System.out.println("Ievadiet lūdzu skaitli");
        int skaitlisViens = scanner.nextInt();
        if (skaitlisViens == 10) {
            System.out.println("Skaitlis ir 10");
        } else if (skaitlisViens == 15) {
            System.out.println("Skaitlis ir 15");
        } else if (skaitlisViens == 20) {
            System.out.println("Skaitlis ir 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        System.out.println("Koda turpinājums 3");

        //Jānodefinē cilvēks- vecums (sieviete no 60, vīrietis no 65; un dzimums (v vai S)

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


        int diena = 4;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards = "Pirmdiena";
                break;
            case 2:
                dienasVards = "Otrdiena";
                break;
            case 3:
                dienasVards = "trešdiena";
                break;
            case 4:
                dienasVards = "ceturtdiena";
                break;
            case 5:
                dienasVards = "piektdiena";
            default:
                dienasVards = "Nezināma diena"

                ;

        }

        System.out.println("Šodien ir " + dienasVards);


        //Pirmais uzdevums
        System.out.println("Lūdzu ievadiet skaitli");
        int skaitlis = scanner.nextInt();
        if (skaitlis > 0) {
            System.out.println("Skaitlis lielāks par nulli");
        } else if (skaitlis<0){
            System.out.println("Skaitlis ir mazāks par 0");
        } else
            System.out.println("Skaitlis ir nulle");


        //otrais uzdevums= skaitlis ir pāra vai nepāra
        int skaitlisJauns = 5;
        if(skaitlisJauns%2==0){
            System.out.println("Skaitlis ir para skaitlis");
        }else{
            System.out.println("Skaitlis ir nepara skaitlis");
        }




    }
}
