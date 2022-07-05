package hommework.classHomework;

public class Main {

    public static void main(String[] args) {
        Trīsstūris trissturisViens= new Trīsstūris();
        trissturisViens.mala1=17;
        trissturisViens.mala2=50;
        trissturisViens.mala3= 50;
        System.out.println("Pirmā trīsstūra malu garumi ir "+ trissturisViens.mala1+ ", "+ trissturisViens.mala2+ ", "+ trissturisViens.mala3);
        System.out.println(trissturisViens.irVienādsānu());
        System.out.println(trissturisViens.irVienādmalu());



        Trīsstūris trissturisDivi= new Trīsstūris(50,50,50);
        System.out.println("Otrā trīsstūra malu garumi ir "+ trissturisDivi.mala1+ ", "+ trissturisDivi.mala2+ ", "+ trissturisDivi.mala3);
        System.out.println(trissturisDivi.irVienādmalu());
        System.out.println(trissturisDivi.irVienādsānu());
        trissturisDivi.printLaukums();



    }
}
