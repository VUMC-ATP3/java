package hommework.oop_homework;

import java.util.Date;

public class Example {

    public static void main(String[] args) {

        Customer customer=new Customer("Ruta");
        customer.setMember(true);
        customer.setMemberType("Gold");
        Visit visit=new Visit(customer,new Date());
        visit.setProductExpense(10.0);
        visit.setServiceExpense(20.0);
        System.out.println(visit);
        System.out.println("Total expense made by " + visit.getName() + " = " + visit.getTotalExpense());


    }
}
