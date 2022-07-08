package hommework;

public class Main {
    public static void main(String[] args) {

        Trissturis trijsturis1=new Trissturis();
        trijsturis1.mala1=16;
        trijsturis1.mala2=188;
        trijsturis1.mala3=188;
        trijsturis1.printMalas();
        System.out.println(trijsturis1.irVienādsānu());
        System.out.println(trijsturis1.irVienādmalu());
        System.out.println("Trijstūra laukums ir "+ trijsturis1.trissturaLaukums(16,188,188));

        System.out.println("########################");

        Trissturis trijstūris2=new Trissturis(16,16,16);
        trijstūris2.printMalas();
        System.out.println(trijstūris2.irVienādsānu());
        System.out.println(trijstūris2.irVienādmalu());
        System.out.println(trijstūris2.trissturaLaukums(16,16,16));


    }

}
