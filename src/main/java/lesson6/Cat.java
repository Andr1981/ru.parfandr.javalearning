package lesson6;

public class Cat extends Animal{
    private String bridOfCats;
    private int distance;
    static int countCat = 0;

    {
        countCat += 1;
    }

    public Cat(String bridOfCats, String name, int age, int distance) {
        super(name, age);
        this.bridOfCats = bridOfCats;
        this.distance = distance;


    }


    @Override
    public void voice() {
        System.out.println(bridOfCats + " " + name + " мяучет и ее возраст составляет : " + age);
    }

    @Override
    public void run() {
        if (distance < 20) {
            System.out.println(name + " пробежала дистанцию в " + distance + " километров");
        } else {
            System.out.println("Кошки столько не бегают, их максимум 30 км, а не " + distance + " км.");
        }

    }
    public static void countNumberCat (){
        System.out.println("Количество кошек в этом классе - " + countCat);
    }
}
