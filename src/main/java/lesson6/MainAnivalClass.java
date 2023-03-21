package lesson6;

import java.util.Random;

import static lesson6.Cat.countCat;
import static lesson6.Cat.countNumberCat;
import static lesson6.Dog.countDog;
import static lesson6.Dog.countNumberDog;

public class MainAnivalClass {
    static int animalCount;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Овчарка", "Ява", 8, (int) (Math.random() * 100));
        Dog dog2 = new Dog("Пудель", "Микки", 5, (int) (Math.random() * 100));
        Dog dog3 = new Dog("Лабрадор", "Джеки", 5, (int) (Math.random() * 100));
        Cat cat1 = new Cat("Британец", "Мурзик", 4, (int) (Math.random() * 100));
        Cat cat2 = new Cat("Шотландец", "Кузя", 3, (int) (Math.random() * 100));
        dog1.voice();
        dog1.run();
        dog2.voice();
        dog2.run();
        dog3.voice();
        dog3.run();
        cat1.voice();
        cat1.run();
        cat2.voice();
        cat2.run();
        countNumberDog();
        countNumberCat();
        animalCount = countDog + countCat;
        System.out.println("Общее количество животных составляет " + animalCount);

    }
}
