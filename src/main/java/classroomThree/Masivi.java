package classroomThree;

import java.util.Random;
import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {
majuParbaude(1,7, 13);

        //do while
        int y = 0;
        do{
            System.out.println("Do while" + y);
            y=y+1;
        }while (y<10);


        Scanner scanner= new Scanner(System.in);
        String parole= "Parole123";
        String lietotajaIevaditaParole;

        do {
            System.out.println("Ievadi paroli");
            lietotajaIevaditaParole=scanner.nextLine();
            System.out.println("Notiek paroles pārbaude");

        } while (!lietotajaIevaditaParole.equals(parole));
        System.out.println("Pareiza parole");


        //likt ievadīt pozītīvu skaitli, ja ievada 0 vai negatīvu, likt ievadīt atkal, ja ir pozitīvs, beigt darbu!

        int number;

        do {
            System.out.println("Ievadiet pozitīvu skaitli");
            number= scanner.nextInt();
        } while (number<=0);
        System.out.println("Derīgs skaitlis " + number);

        //




        int sakotnejais = 1;
        while (sakotnejais<=100){
            System.out.println(sakotnejais);
            sakotnejais ++; // tas ir tas pats, kas sakotnejais=sakotnejais+1;

        }

        //ja grib, lai tikai pāra skaitļus tad sākotnējais = 0 un tad viņu pēc katras reizes palielina par 2 nevis par 1


        //for cikls
        for (int i = 5; i <11; i++) {
            System.out.println("For cikls " + i);}

        for (int i = 10; i <=10 ; i=i+2) {
            System.out.println(i); // tikai pāra skaitļus izprintē
        }


        String [] mansMasivs= {"Juris","Anna", "Ruta"};
        for (int i = 0; i < mansMasivs.length; i++) {
            System.out.println(mansMasivs[i]);
        }

        //for each- katram mainīgajam MASĪVĀ izdara kādu darbību
        String [] mansMasivs2= {"Juris","Anna", "Ruta", "Kristīne"};
        for (String šoDruka: mansMasivs2){
            System.out.println(šoDruka);
        }

        //break

        System.out.println("Cikla sākums");
        for (int i = 0; i < 10; i++) {
            if (i==5){
                System.out.println("Ja i ir 5, laužam ciklu");
                break;
            }
            System.out.println("Print Break example"+i);
        }
        System.out.println("Cikla beigas");

        //atrast masīvā pirmo negatīvo skaitli un izvadīt to un tā indeksu pozīciju uz ekrāna
        int [] skaitluMasivs = {1,2,3,4,5,-6,7,8,9,0,-3};
        for (int i = 0; i < skaitluMasivs.length; i++) {
            System.out.println("Viss masīvs " + skaitluMasivs[i]);
            if (skaitluMasivs[i]<0){
                System.out.println("Pirmais negatīvais skaitlis: " + skaitluMasivs[i]);
                System.out.println("Indekss ir: " + i );
                break;
            }

        }
// ar continue- ja satiks negatīvu, viņu vienkārši noignorēs un turpinās
        int [] skaitluMasivs2 = {1,2,3,4,5,-6,7,8,9,0,-3};
        for (int i = 0; i < skaitluMasivs2.length ; i++) {
            if (skaitluMasivs2[i]<0){
                continue;
            }
            System.out.println("Vērtība no masīva" + skaitluMasivs2[i]);
        }


        //saraksts-array-massīvs:
        String[] stacijas= {" stacija1", " stacijas2", "Bērnu pasaule", "Ziedoņdārzs"};
        String[] pieturas= {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs"};

        printetTekstaMasivu(stacijas);
        printetTekstaMasivu(pieturas);

        System.out.println(pieturas[0]+ pieturas[1]+pieturas[2]);

        int[] majuNummuri = {1,2,3,4,5,6,7,8,9,10};
        int e = 0;
        while (e< majuNummuri.length){
            System.out.println("Mājas nummurs ir " + majuNummuri[e]);
            e=e+1;
        }

        printetIntegerMasivu(majuNummuri);

        char[] patskani = {'a','e','i'};



        //nomainu vienu no mainīgajiem:
        pieturas[0]= "Zemitānu stacija";
        System.out.println(pieturas[0]);


        //Lai izrēķina, cik mainīgie ir masīvā
        System.out.println("Cik pieturas ir masīvā?" + pieturas.length);
        System.out.println("Cik mājas ir uz ielas?"+ majuNummuri.length);

        //Masīvs, kurā no sākuma nav definēti mainīgie
        String[] hokejaCempioniTopTris= new String[3];
        System.out.println("Cik vietas ir čempionātā?" + hokejaCempioniTopTris.length);
        String pirmaVieta="Somija";
        String otraVieta= "Kanāda";
        String tresaVieta= "Čehija";

        hokejaCempioniTopTris[0]= pirmaVieta;
        hokejaCempioniTopTris[1]= otraVieta;
        hokejaCempioniTopTris[2]= tresaVieta;

        System.out.println("Balvu ieguvēji čempionātā ir: " + "\n" + hokejaCempioniTopTris[0]+ "\n"+hokejaCempioniTopTris[1]+ "\n"+ hokejaCempioniTopTris[2]);


        // while piemērs (kods kurš izpildās, kamēr nosacīojums ir paties)
        int i = 0;
        System.out.println("Cikla sākums");
        while (i<5){
            System.out.println(i);
            i=i+1;
        }

        System.out.println("Cikla beigas");


    }

    static void printetTekstaMasivu(String[]randomMasivs){
        int kursPecKartas = 0;
        while (kursPecKartas > randomMasivs.length){ //kurspecKartas<kurspecKartas.lenght
            System.out.println(randomMasivs[kursPecKartas]);
            kursPecKartas=kursPecKartas+1;
        }

    }

    static void printetIntegerMasivu (int[] kautKo){
        int i = 0;
        while (i< kautKo.length){
            System.out.println(kautKo[i]);
            i++; //i=i+1
        }

    }

    static void majuParbaude(int sakums, int beigas, int iznemums){
        int majuNumuri = sakums;
        while (majuNumuri<=beigas){
            if(majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri==iznemums){
                System.out.println("Šie māju nummuri neder" + majuNumuri);
            } else {
                System.out.println("Šie māju numuri der" + majuNumuri);
            }
            majuNumuri=majuNumuri+1;
        }

//random skaitli

        Random skaitluGenerators = new Random();
        int nejausSkaitlis = skaitluGenerators.nextInt(50);
        System.out.println(nejausSkaitlis);


        Random skaitluGenerators2 = new Random();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(skaitluGenerators2.nextInt(1000));
        }

    }

}
