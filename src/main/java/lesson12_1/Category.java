package lesson12_1;

import java.util.ArrayList;
import java.util.List;

public class Category implements PrintCategoriesAndGoods {
    String name;
    Goods[] goods;


    public Category(String name) {
        this.name = name;

    }
    public Category() {


    }

    public List<Category> makeCategoryList() {
        Category milkCategory1 = new Category("Молочная продукция");
        Category meatCategory1 = new Category("Мясная продукция");
        List<Category> categories = new ArrayList<Category>();
        categories.add(milkCategory1);
        categories.add(meatCategory1);
        return categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods... goods) {
        this.goods = goods;

    }


    public void printInfo(PrintCategoriesAndGoods...printCategoriesAndGoods) {
            System.out.println("- " + this.name + " ;");


    }
}
