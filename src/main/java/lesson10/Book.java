package lesson10;

public class Book implements Printable {
    String kind;
    String author;
    String name;
    int price;

    public Book(String kind, String author, String name, int price) {
        this.kind = kind;
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Это книга, жанр: " + kind + ", Автор: " + author + ", Название: " + name + ", цена: " + price + " .");
    }

    public static void printBook(Printable... printables) {
        for (Printable p : printables) {
        if (p instanceof Book){
            System.out.println("Только названия книг: " + ((Book) p).getName() + "и ее цена : " + ((Book) p).getPrice());
        }
        }
    }
}
