package homework;

public class HomeWork {
    public static void main(String[] args) {
        //te būs mājasdarbs
        String valsts = "Itālija";
        int iedzivotajuSkaits = 61482297;
        double platibaItalija = 301323;
        String galvaspilseta = "Roma";
        String valoda = "Itāļu";
        boolean esValsts = true;
        char valuta = 'E';



        System.out.println("Izvēlētā valsts " + valsts);
        System.out.println("Iedzīvotāju skaits " + iedzivotajuSkaits);
        System.out.println("Tās platība ir " + platibaItalija + " km2");
        System.out.println("Galvaspilsēta ir skaistā " + galvaspilseta);
        System.out.println("Oficiālā valsts valoda ir " + valoda);
        System.out.println("Vai ir ES dalībvalsts? " + esValsts);
        System.out.println("Oficiālā valsts valūta ir " + valuta);


        System.out.println(valsts + " un " + galvaspilseta + " ir populāri tūristu galamērķi. " +
                "Tā kā tās platība ir " + platibaItalija + " km2, tad nekad nebūs iespējams satikt visus "
        + iedzivotajuSkaits + " tās iedzīvotājus. Papildus ceļošanu atvieglo valsts valūta " + valuta +
                " ,kurā tūristiem viegli orientēties, lai gan nelielas grūtības varētu sagādāt komunicēšana " +
                valoda + " valodā.");

        int a =30;
        int b =10;
        int summaAB =a+b;
        int starpibaAB =a-b;
        int reizinajumsAB =a*b;
        int dalijumsAB =a/b;

        System.out.println("Burts a ir " +a + " ,bet burts b ir " + b + ". Šo skaitļu summa ir " + summaAB + " ,starība ir " + starpibaAB + ", to reizinājums ir " + reizinajumsAB + ", bet dalījums ir " + dalijumsAB+ " .");


        double c = 50;
        double d =15.5;
        double summaCD =c+d;
        double starpibaCD =c-d;
        double reizinajumsCD =c*d;
        double dalijumsCD =c/d;
        double atlikumsCD = c%d;

        System.out.println("Burts c ir " +c + " ,bet burts d ir " + d+ ". Šo skaitļu summa ir " + summaCD + " ,starība ir " + starpibaCD + ", to reizinājums ir " + reizinajumsCD + ", bet dalījums ir " + dalijumsCD+ " un atlikums" + atlikumsCD + ".");

        double e = 74;
        double f = 100;
        double summaEF =e+f;
        double starpibaEF =e-f;
        double reizinajumsEF =e*f;
        double dalijumsEF =e/f;
        double atlikumsEF = e%f;

        System.out.println("Burts e ir " +e + " ,bet burts f ir " + f+ ". Šo skaitļu summa ir " + summaEF + " ,starība ir " + starpibaEF + ", to reizinājums ir " + reizinajumsEF + ", bet dalījums ir " + dalijumsEF+ " un atlikums" + atlikumsEF + ".");


    }

    };

