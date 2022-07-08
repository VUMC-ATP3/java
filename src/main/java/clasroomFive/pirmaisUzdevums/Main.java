package clasroomFive.pirmaisUzdevums;

import clasroomFive.encapsulation.Wether;

public class Main {
    public static void main(String[] args) {
        Author ziedonis= new Author("Ziedonis","zied@gmail.com", 'V' );
        Author Rainis = new Author("Jānis Rainis","JR@gmail.com",'M');

        Cena cena= new Cena(9.99,'$');


        Book bookOne=new Book("Harry Potter", new Cena(15,'E'), Rainis);
        Book bookTwo = new Book("Harijs Potters 2",cena, ziedonis);

        System.out.println(bookTwo.price);
        bookTwo.price.discount(30);
        System.out.println(bookTwo.price);

        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        System.out.println(bookOne.author.toString());

        Wether weather = new Wether();

    }
}
