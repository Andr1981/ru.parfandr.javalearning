package lesson10;

public class Magazine implements Printable {
    String kind;
    String author;
    String name;
    int price;


    public Magazine(String kind, String author, String name, int price) {
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
        System.out.println("Этот журнал, жанр: " + kind + ", Издательство: " + author + ", Название: " + name + ", цена: " + price + " .");
    }

    public static void printMagazine(Printable... printables) {
        for (Printable p : printables) {
        if (p instanceof Magazine){
            System.out.println("Только названия журналов: " + ((Magazine) p).getName() + " и его цена: " + ((Magazine) p).getPrice());
        }
        }

    }
}
