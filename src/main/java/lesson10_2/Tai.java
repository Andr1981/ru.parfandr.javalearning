package lesson10_2;

import java.util.Arrays;

public class Tai extends Clothes implements MenClothes {
    private String model;

    public Tai(int size, double prise, String color, String model) {
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
            System.out.println("Галстук " + getModel() + " одет");
        } else {
            System.out.println("Галстука " + getModel() + " такого размера нет");
        }
    }

    @Override
    public String toString() {
        return "Галстук мужской : " +
                "модель - " + model + ' ' +
                ", размеры - " + size +
                ", цена - " + prise +
                " р., цвет - " + color + ' ' + "." +
                ' ';
    }
}
