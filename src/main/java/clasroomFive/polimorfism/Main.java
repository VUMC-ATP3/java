package clasroomFive.polimorfism;

public class Main {
    public static void main(String[] args) {
        Calculater calc= new Calculater();
        System.out.println(calc.sum(1,8));
        System.out.println(calc.sum(5,8,5));

        //es tikai rakstīju calc.sum()un iekavās rakstīju skaitļus un pēc tā, ko es rakstīju viņā pats saprata, kuru no trim metodēm viņam izvēlēeties


        Car car=new Car();
        Motorcikle motorcikle=new Motorcikle();
        car.move();
        motorcikle.move();
        car.stop();
        motorcikle.stop();

    }
}
