package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
        System.out.println("В тарелке - " + food + " еды");
    }

    public void decreaseFood(int n) {
        food -= n;
        System.out.println("Было съедено " + n + " еды");
        System.out.println("В тарелке осталось - " + food);

    }

    public int getFood() {
        return food;
    }
}
