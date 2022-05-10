package classroom;

public class Main {
    public static void main(String[] args) {
        int vecumsSuns = 3; //vesels skaitlis
        String vardsSuns = "Reksis"; //teksts
        double svarsSunim = 8.5; // daļskaitlis
        float augumsSunim = 30.5F;
        boolean irIzsalcis = true;
        boolean isFearless = false;
        byte monthsInYear = 12;
        long netIncom = 1212121212;
        short autoPrice = 12312;
        char dzimums = 'v';
        char vaditajaKategorija = 'B';


        System.out.println();
        System.out.println(netIncom + "\n" + monthsInYear + "\n" + autoPrice + "\n");

        System.out.println();

        System.out.println("Mans suns");
        System.out.println("vards sunim");
        System.out.println(vardsSuns);
        System.out.println("vecums sunim");
        System.out.println(vecumsSuns);
        System.out.println("svars sunim");
        System.out.println(svarsSunim+" kg");
        System.out.println("Mans suņa augums" + " " + augumsSunim + " cm");
        System.out.println("Vai mans suns ir izsalcis?");
        System.out.println(irIzsalcis);

        System.out.println();
        System.out.println();

        int vecumsKakis = 15;
        String vardsKakis = "Muris";

        System.out.println("Mans kakis");
        System.out.println("Vards kakim");
        System.out.println(vardsKakis);
        System.out.println("vecums sunim");
        System.out.println(vecumsKakis);

        System.out.println("Suņa un kaķa kopējais vecums:");
        System.out.println(vecumsSuns+vecumsKakis);


        int summa;
        int starpība;
        int reizinajums;
        double dalijums;

        int x = 5;
        int y = 10;

        reizinajums = x * y;
        summa = x + y;
        starpība = x - y;

        double t = 5;
        double k = 6;


        System.out.println("Summa" + summa);
        System.out.println("Starpība" + starpība);
        System.out.println("reizinajums" + reizinajums);
        System.out.println("Starpība" + starpība);

        System.out.println("Ruta");
    }
}
