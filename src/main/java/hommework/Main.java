package hommework;

public class Main {
    public static void main(String[] args) {

        Trissturis trijsturis1=new Trissturis(8,15,7);
        trijsturis1.mala1=16;
        trijsturis1.mala2=188;
        trijsturis1.mala3=16;
        trijsturis1.printMalas();
        System.out.println(trijsturis1.irVienādsānu());
        System.out.println(trijsturis1.irVienādmalu());
        System.out.println(trijsturis1.laukums);
        trijsturis1.trissturLaukums(7,9,189);

        Trissturis trijstūris2=new Trissturis(16,16,16);
        trijstūris2.printMalas();
        System.out.println(trijstūris2.irVienādsānu());
        System.out.println(trijstūris2.irVienādmalu());
        System.out.println(trijstūris2.laukums);
        System.out.println("Vai strādā");

    }

}
