package clasroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Wether wether = new Wether();
        wether.printWeather();
//        wether.metodeDivi(); nevar izsaukt jo ir privāta
        wether.metodeTris();

        wether.isReining=true;
        wether.temperatureAtNight=13.4;


        Human cilveks=new Human();
        Human cilveks2=new Human();
        Human cilveks3= new Human(12,189,"Pēteris");

        System.out.println(cilveks3.toString());
        cilveks3.setAge(14);//nomainījām vecumu, lai gan tas bija private
        System.out.println(cilveks3.toString());
// Riņķa uzdevums

        Rinkis rinkisViens= new Rinkis();
        System.out.println(rinkisViens.toString());
        rinkisViens.setRadius(2.0);
        System.out.println(rinkisViens.toString());

        Rinkis rinkisDivi=new Rinkis(3, "blue");
        System.out.println(rinkisDivi.toString());
        rinkisDivi.setColour("green");
        System.out.println(rinkisDivi.toString());




    }
}
