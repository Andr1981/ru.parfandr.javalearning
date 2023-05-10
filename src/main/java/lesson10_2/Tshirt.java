package lesson10_2;

import java.util.Arrays;

public class Tshirt extends Clothes implements MenClothes, WomanClothes {
    private String model;

    public Tshirt(int size, double prise, String color, String model) {
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
            System.out.println("Футболка " + getModel() + " одета");
        } else {
            System.out.println("Футболки " + getModel() + " такого размера нет");
        }
    }

    public void womanClothe(int size) {

    }

    @Override
    public String toString() {
        return "Футболка мужская : " +
                "модель - " + model + ' ' +
                ", размеры - " + size +
                ", цена - " + prise +
                " р., цвет - " + color + ' ' + "." +
                ' ';
    }
}
