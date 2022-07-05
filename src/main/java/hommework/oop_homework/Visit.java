package hommework.oop_homework;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpence;
    private double productExpence;

//    public Visit(Customer customer; Date date){
//        this.customer = customer;
//        this.date = date;
//    }

    public String getName(){
        return this.customer.getName();

    }

    public double getServiceExpence() {
        return this.serviceExpence;
    }

    public double getProductExpence() {
        return this.productExpence;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setServiceExpence(double ex) {
        this.serviceExpence = ex;
    }

    public void setProductExpence(double ex) {
        this.productExpence = ex;
    }
}


