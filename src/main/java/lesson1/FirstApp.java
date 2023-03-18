package lesson1;

public class FirstApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Tree bana = new Tree("Банан", 5);
        Tree aplle = new Tree("Яблоко", 10);
        Tree orange = new Tree("Апельсин", 15);
        bana.printTree();
        aplle.printTree();
        orange.printTree();

        if (bana.getAge() < 15) {
            bana.setAge(25);
            System.out.printf("Новый возраст бананы %d\n", bana.getAge());
        }
        if (aplle.getAge()+ orange.getAge()>10) {
        System.out.printf("Яблоко и апельсин это старые деревья, им более 10 лет, а точнее %d лет",aplle.getAge()+ orange.getAge());
        }


    }
}