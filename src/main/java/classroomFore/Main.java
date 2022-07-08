package classroomFore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skeneris=new Scanner(System.in);
        House majaViens= new House(4);

        majaViens.majasNumurs=33;
        majaViens.ielasNosaukums="Brīvības iela";
        majaViens.irLifts= false;
        majaViens.irAutoStavvieta=true;
        majaViens.krasa="Zaļā";
        majaViens.printHouse();

        House majaDivi= new House(7);

        majaDivi.majasNumurs=2;
        majaDivi.ielasNosaukums="Stabu iela";
        majaDivi.irLifts= true;
        majaDivi.irAutoStavvieta=true;
        majaDivi.krasa="Rozā";
        majaDivi.printHouse();


        Velosipeds zzk=new Velosipeds();
        zzk.bremzuTips='D';
        System.out.println("Velo ātrums ir "+ zzk.atrums);
        System.out.println("Cilvēks uzkāpj uz velo un sāk braukt");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        System.out.println("Velo ātrums ir "+ zzk.atrums);

        System.out.println("Priekšā izlec kaķis.");
        zzk.bremzet();
        System.out.println("Velo ātrums ir "+ zzk.atrums);

        Velosipeds miranda=new Velosipeds();
        miranda.bremzuTips= 'V';
        System.out.println("Jaunā velo ātrums ir "+ miranda.atrums);
        // otra ātrumu printēšanas metode
        miranda.printetAtrumu();

        Darbinieks ruta= new Darbinieks();
        ruta.vards= "Ruta Jurjane";
        ruta.vecums= 31;
        ruta.alga= 2000;
        System.out.println("Jaunā darbinieka vārds ir "+ ruta.vards+ " , tās alga ir "+ ruta.alga+ " eur nedēļā.");
        ruta.pielikums();
        ruta.pielikums();
        ruta.printAlga();

        Rinkis mansRinkis= new Rinkis();
        System.out.println(mansRinkis.PI);
        mansRinkis.radius=5;
        System.out.println(mansRinkis.radius);
        System.out.println(mansRinkis.rinkaLaukumaAprekins());

        Rinkis mansRinkis2= new Rinkis();
        System.out.println(mansRinkis2.PI);
        mansRinkis2.radius=50;
        System.out.println(mansRinkis2.radius);
        System.out.println(mansRinkis2.rinkaLaukumaAprekinsFormula ());
        System.out.println(mansRinkis2.rinkaLinijasAprekins());

        mansRinkis.prinCurrentTime();
        mansRinkis2.prinCurrentTime();

        Rinkis mansRinkis3= new Rinkis(3);
        System.out.println(mansRinkis3.laukums+ " " + mansRinkis3.rinkaLinijasGarums);

        Taisnsturis taisnsturis1= new Taisnsturis();
        taisnsturis1.mala1=12.4;
        taisnsturis1.mala2=3.5;
        System.out.println("Taisnstūra viens laukums ir " + taisnsturis1.aprekinaLaukumu());



        Taisnsturis taisnsturis2= new Taisnsturis(4.8, 5);
        System.out.println("Taisnstūra divi laukums ir " + taisnsturis2.aprekinaLaukumu());

        Suns reksis= new Suns();
        reksis.vaiRej= false;
        System.out.println(reksis.vaiRej);
        reksis.astesGarums=5;
        reksis.name= "Dingo";
        reksis.printName();

        Animal dzivnieks= new Animal();
        dzivnieks.name= "ZiZi";

        Cat kakis= new Cat();
        kakis.name= "Muris";
        kakis.izdodSkanu();
        kakis.printName();


Zilonis elepfant= new Zilonis();
elepfant.snukaGarums= 5;
elepfant.izdodSkanu();
elepfant.name= "Igors";
elepfant.printName();
        };

}
