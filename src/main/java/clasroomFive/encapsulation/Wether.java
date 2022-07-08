package clasroomFive.encapsulation;

 public class Wether {
     boolean isReining; //defoult- varam piekļūt klases un pakotnes līmenī
     public boolean isSunShining;// varam piekļūt visur
     private boolean isSnoving; //varam piekļūt klases līmenī
     private double temperatureAtDey;//- neļaus citā klasē šo izmantot
     public double temperatureAtNight;


     public void printWeather(){
         System.out.println("Šī ir publiska metode" );
         System.out.println("Ārā līst lietus visu dienu");
         metodeDivi();
     }

     private void metodeDivi(){
         System.out.println("Šī ir privāta metode");
     }

     void metodeTris(){
         System.out.println("Šī ir defoult metode");
     }

}
