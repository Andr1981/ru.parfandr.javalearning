package lesson10_2;

import java.util.Arrays;

public class Trausers extends Clothes implements MenClothes, WomanClothes {
    private String model;

    public Trausers(int size, double prise, String color, String model) {
        super(size, prise, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void menClothe(int size) {
        if (size == getSize()) {
            System.out.println("Брюки " + getModel() + " одеты");
        } else {
            System.out.println("Брюк " + getModel() + " такого размера нет");
        }
    }

    public void womanClothe(int size) {
        if (size == getSize()) {
            System.out.println("Брюки " + getModel() + " одеты");
        } else {
            System.out.println("Брюки " + getModel() + " такого размера нет");
        }
    }

    @Override
    public String toString() {
        return "Брюки унисекс : " +
                "модель - " + model + ' ' +
                ", размеры - " + size +
                ", цена - " + prise +
                " р., цвет - " + color + ' ' + "." +
                ' ';
    }
}

