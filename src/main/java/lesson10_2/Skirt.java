package lesson10_2;

import java.util.Arrays;

public class Skirt extends Clothes implements WomanClothes {
    private String model;


    public Skirt(int size, double prise, String color, String model) {
        super(size, prise, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void womanClothe(int size) {
        if (size == getSize()) {
            System.out.println("Юбка " + getModel() + " одета");
        } else {
            System.out.println("Юбки " + getModel() + " такого размера нет");
        }

    }

    @Override
    public String toString() {
        return "Юбка женская : " +
                "модель - " + model + ' ' +
                ", размеры - " + size +
                ", цена - " + prise +
                " р., цвет - " + color + ' ' + "." +
                ' ';
    }
}
