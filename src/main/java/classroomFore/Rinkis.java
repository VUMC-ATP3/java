package classroomFore;

import java.sql.Timestamp;

public class Rinkis {
    final double PI=3.14;
    double radius;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    //konstruktors
    Rinkis(){
        System.out.println("Mēs veidojam riņķa konstruktoru");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);

    }

    Rinkis(double padotaisRadiuss){
        radius=padotaisRadiuss;
        laukums=rinkaLaukumaAprekins();
        rinkaLinijasGarums=rinkaLinijasAprekins();
    }


    public void prinCurrentTime(){
        System.out.println(timestamp);
    }

    public double rinkaLaukumaAprekins(){
        System.out.println("Aprēķinu laukumu");
        return radius*radius* PI;
    }

    public double rinkaLaukumaAprekinsFormula(){
        return Math.pow(radius,2)* Math.PI; //veids kā ar formulu pacelt pakāpē
    }

    public double rinkaLinijasAprekins(){
        System.out.println("Aprēķinu Linijas garumu");
        return 2*Math.PI*radius;
    }
}
