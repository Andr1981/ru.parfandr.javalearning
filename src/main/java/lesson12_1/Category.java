package lesson12_1;

public class Category implements PrintCategoriesAndGoods {
    String name;
    Goods[] goods;


    public Category(String name) {
        this.name = name;

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


    public void printInfo(PrintCategoriesAndGoods... printCategoriesAndGoods) {
            System.out.println("- " + this.name + " ;");


    }
}
