package HomeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // daļa no 5-8.uzdevuma

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printBusinessCardTwo("Ruta", "Jurjāne", 26986929, 1991);
        printBusinessCardTwo("Jana", "Kalniņa", 27175293, 1985);
        int summa = aprekinaSummu(5,10);
        System.out.println(summa);
        System.out.println(average(10,2,4));





        //1.uzdevums
        int x = 10;

        System.out.println(x>1);
        System.out.println(x<1);
        System.out.println((x>5)&&(x<=10));

        x=9;
        System.out.println((x != 5) && (x < 10));
        System.out.println((x==0)||(x==10));
        System.out.println((x*x)>10);

        //2.uzdevums

        System.out.println("Lūdzu ievadiet ar skaitli, kāds šodien mēnesis.");
        int menesis = scanner.nextInt();
        String menesaVards;
        switch (menesis){
            case 1 : menesaVards = "janvāris";
            break;
            case 2:menesaVards= "februāris";
            break;
            case 3: menesaVards= "marts";
            break;
            case 4: menesaVards= "aprīlis";
            break;
            case 5: menesaVards= "maijs";
            break;
            case 6: menesaVards= "jūnijs";
            break;
            case 7: menesaVards= "jūlijs";
            break;
            case 8: menesaVards= "augusts";
            break;
            case 9: menesaVards= "septembris";
            break;
            case 10: menesaVards= "oktobris";
            break;
            case 11: menesaVards= "novembris";
            break;
            case 12: menesaVards= "decembris";
            break;
            default: menesaVards= "nezināms mēnesis";


        }

        System.out.println("Šodien ir " + menesaVards);

// 3.uzdevums

        System.out.println("Lūdzu ievadiet veselo skaitli a. ");
        int a = scanner.nextInt();
        System.out.println("Lūdzu ievadiet veselo skaitli b. ");
        int b = scanner.nextInt();
        System.out.println("Lūdzu ievadiet veselo skaitli c. ");
        int c = scanner.nextInt();
        if ((a>b)&&(a>c)) {
            System.out.println("Lielākais no skaitļiem ir " + a);
        }
        else if ((b>a)&&(b>c)) {
            System.out.println("Lielākais no skaitļiem ir " + b);
        }
        else if ((c>b)&&(c>a)) {
            System.out.println("Lielākais no skaitļiem ir " + c);
        }
        else {
            System.out.println("Atbilde nav nosakāma");

        }

// 4.uzdevums
        System.out.println("Kādas krāsas gaisma deg luksaforā? ");
        String krasa = "Sarkana";
        if (krasa.equals("Zaļa")) {
            System.out.println("Zaļā. Jūs drīgstat iet pāri ceļam.");
        } else if (krasa.equals("Sarkana")) {
            System.out.println("Stāt! Deg sarkanā gaisma.");
        } else if (krasa.equals("Dzeltene")) {
            System.out.println(" Dzeltena. Lūdzu gaidiet zaļo gaismu!");
        } else {
            System.out.println("Luksafors nedarbojas, pirms šķērsojat ceļu, pārliecinieties, ka nebrauc mašīnas!");
        }






    }

    // 5.uzdevums

    static void printBusinessCard (){
        System.out.println("Vizītkarte");
        System.out.println("***********");
        System.out.println("Vārds: Ruta");
        System.out.println("Uzvārds: Jurjāne");
        System.out.println("Telefona nr. 26986929");
        System.out.println("Dzimšanas gads: 1991");
        System.out.println("**********");
    }

    //6. uzdevums

    static void printBusinessCardTwo (String vārds, String uzvārds,int telefonaNr, int dzimšanasGads ){
        System.out.println("Vizītkarte DIVI");
        System.out.println("***********");
        System.out.println("Vārds: " + vārds);
        System.out.println("Uzvārds: " + uzvārds);
        System.out.println("Telefona nr. " + telefonaNr);
        System.out.println("Dzimšanas gads: " + dzimšanasGads);
        System.out.println("**********");
    }

    // 7.uzdevms

    static int aprekinaSummu (int a, int b){
        int summa = a*b;
        return summa;

    }

    //8.uzdevums
    static double average (double a, double b, double c){
        double videjais = (a+b+c)/3;
        return videjais;

    }

}
