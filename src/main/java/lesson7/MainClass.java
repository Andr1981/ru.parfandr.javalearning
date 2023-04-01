package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 15);
        cats[1] = new Cat("Мурзик", 90);
        cats[2] = new Cat("Кузя", 20);

        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].isSatiety());
        }
    }
}
