package classroomThree;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {
        kvadrātLaukums(3);
        Scanner skeneris = new Scanner(System.in);
        System.out.println(kvadrātLaukums(3));

    }


    //metode, kas aprēķina kvadrāta laukumu


    static int kvadrātLaukums(int mala) {
        int laukums = mala * mala;
        return laukums;
    }


}
