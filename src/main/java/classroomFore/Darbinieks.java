package classroomFore;

public class Darbinieks {
    int alga;
    String vards;
    int vecums=18;
    char dzimums;
    boolean veselibasApdros;


    public void pielikums(){
        if (vecums>30){
            alga=alga+100;
        }else {
            alga=alga +50;
        }
}

public void printAlga()
{
    System.out.println("Darbinieka alga ir " +alga);

}

}
