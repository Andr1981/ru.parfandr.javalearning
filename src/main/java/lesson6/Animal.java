package lesson6;

public abstract class Animal {
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    {

    }
    abstract void voice();

    abstract void run();
}
