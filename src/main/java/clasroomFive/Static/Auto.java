package clasroomFive.Static;

public class Auto {
    public String marka;
    public static String klasesNosaukums= "Autoklase";
    public static int totalCarCreated=0;

    Auto(String marka){
        this.marka=marka;
        totalCarCreated++;
    }

    public static void printText(){
        System.out.println("Printeju tekstu");
    }
}
