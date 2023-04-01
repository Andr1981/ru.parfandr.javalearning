package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        System.out.println("Кот " + name + " собирается поесть ");
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("В тарелке недостаточно еды");
        }


    }
}
