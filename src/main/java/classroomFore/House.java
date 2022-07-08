package classroomFore;
//klases locekļi
public class House {
    int stavuSkaits;
    boolean irLifts;
    boolean irAutoStavvieta;
    String krasa;
    String ielasNosaukums;
    int majasNumurs;

    public House(int stavuSkaits) {
        this.stavuSkaits = stavuSkaits;
    }



    //klases metodes

    public void printHouse(){
        System.out.println("Mājas adrese ir "+ ielasNosaukums+ " "+ majasNumurs);
        System.out.println("Māja ir "+ krasa+ " krāsā.");
        System.out.println("Mājā ir "+ stavuSkaits+ " stāvu skaits.");

    }
    public String adrese(){
        return ielasNosaukums+" "+ majasNumurs;

    }

}
