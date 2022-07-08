package clasroomFive.Static;

public class Main {
    public static void main(String[] args) {


        System.out.println("Cik auto objekti uztaisīti"+ Auto.totalCarCreated);
        Auto masina = new Auto("BMW");
        Auto masinaDivi = new Auto("Mercedes");
        System.out.println("Cik auto bbjekti uztaisīti "+ Auto.totalCarCreated);
        Auto masina3i = new Auto("Opel");
        Auto masina5i = new Auto("Fiat");
        System.out.println("Cik auto objekti uztaisiti: " +
                Auto.totalCarCreated);

        Auto.printText();
        Auto.printText();






    }
}
