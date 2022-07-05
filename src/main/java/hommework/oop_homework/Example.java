package hommework.oop_homework;

public class Example {

    public static void main(String[] args) {

        Customer customer=new Customer("Ruta");
        customer.setMember(true);
        customer.setMemberType("Gold");
        customer.isMember();
        System.out.println(customer.toString());
    }
}
