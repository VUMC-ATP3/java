package clasroomFive.pirmaisUzdevums;

public class Book {

   public String name;
    public Cena price;
    public Author author;

    public Book(String name, Cena price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
