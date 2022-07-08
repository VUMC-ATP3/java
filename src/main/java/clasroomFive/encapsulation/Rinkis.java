package clasroomFive.encapsulation;

public class Rinkis {
    private double radius;
    private String colour;

   Rinkis(){
      radius = 1.0;
      colour = "red";

   }

    public Rinkis(double radiuss, String krasa) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    double aprekinaRinkaLukumu(){
       return Math.pow(radius, 2) * Math.PI;

    }

    @Override
    public String toString() {
        return "Rinkis{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}

