package lesson6;

public class Dog extends Animal {
    private String bridOfDogs;
    private int distance;
    static int countDog = 0;

    {
        countDog += 1;
    }

    public Dog(String bridOfDogs, String name, int age, int distance) {
        super(name, age);
        this.bridOfDogs = bridOfDogs;
        this.distance = distance;


    }


    @Override
    public void voice() {
        System.out.println(bridOfDogs + " " + name + " лает и ее возраст составляет : " + age);
    }

    @Override
    public void run() {
        if (distance < 50) {
            System.out.println(name + " пробежала дистанцию в " + distance + " километров");
        } else {
            System.out.println("Собаки столько не бегают, их максимум 50 км, а не " + distance + " км.");
        }

    }
    public static void countNumberDog (){
        System.out.println("Количество собак в этом классе - " + countDog);
    }
}
