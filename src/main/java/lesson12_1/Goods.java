package lesson12_1;

import java.util.ArrayList;
import java.util.List;

public class Goods implements PrintCategoriesAndGoods {
    private int id;
    private String name;
    private double prise;
    private int rating;


    public Goods(int id, String name, double prise, int rating) {
        this.id = id;
        this.name = name;
        this.prise = prise;
        this.rating = rating;

    }

    public Goods() {

    }

    public List<Goods> makeGoodsList() {
        Goods milkGood1 = new Goods(1, "Молоко Простоквашено", 85.00, 2);
        Goods milkGood2 = new Goods(1, "Молоко Зеленый Луг", 105.00, 1);
        Goods milkGood3 = new Goods(1, "Молоко Домик в деревне", 90.00, 3);
        Goods meatGood1 = new Goods(2,"Сосиски Молочные", 235.00, 8);
        Goods meatGood2 = new Goods(2,"Сосиски Клинские", 250.00, 7);
        List<Goods> goods = new ArrayList<Goods>();
        goods.add(milkGood1);
        goods.add(milkGood2);
        goods.add(milkGood3);
        goods.add(meatGood1);
        goods.add(meatGood2);
        return goods;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prise=" + prise +
                ", rating=" + rating +
                '}';
    }

    public void printInfo(PrintCategoriesAndGoods... printCategoriesAndGoods) {
        System.out.println("- " + this.name + " : " + this.prise + " руб.");
    }
}
