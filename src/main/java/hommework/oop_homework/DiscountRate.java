package hommework.oop_homework;

public class DiscountRate {
    static private double serviceDiscountPremium = 0.2;
    static private double serviceDiscountGold = 0.15;
    static private double serviceDiscountSilver = 0.1;
    static private double productDiscountPremium = 0.1;
    static private double productDiscountGold = 0.1;
    static private double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

}

