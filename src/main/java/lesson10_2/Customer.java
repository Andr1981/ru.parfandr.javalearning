package lesson10_2;

public class Customer {
    private String kind;
    private String name;
    private int size;

    public Customer(String kind, String name, int size) {
        this.kind = kind;
        this.name = name;
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Покупатели: " +
                "пол - " + kind + ' ' +
                ", Имя - " + name + ' ' +
                ", размер - " + size +
                ' ';
    }
}
