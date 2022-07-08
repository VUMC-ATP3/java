package clasroomFive.encapsulation;

public class Human {
    private int age;
    private double weight;
    private String name;

    Human() {
        System.out.println("Uztaisa jaunu cilvēku");
    }

    public Human(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge(int i) {
        return age;
    }

    //nosacījumus uzreiz var iekļaut, piemēram, ka nedrīgst būt zemm nulles vecums
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Vecums nedrīgst būt mazāks par nulli");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    //šo nedrīgst, jo vārdu var tikai vienreiz ievadīt un vairāk mainīt nevar
//    public void setName(String name) {
//        this.name = name;


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}

