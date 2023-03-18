package lesson1;

public class Tree {
    String name;
    int age;


    public Tree(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    void printTree() {
        System.out.printf("Название дерева: %s \tЕго возраст: %d \n", name, age);
    }


}
