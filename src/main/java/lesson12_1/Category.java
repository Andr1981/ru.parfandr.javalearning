package lesson12_1;

public class Category {
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

    public void setGoods(Goods[] goods) {
        this.goods = goods;
        printCategoryAndProducts(goods);
    }
    public void printCategoryAndProducts(Goods[] goods){
        System.out.println("В категории " + this.name + " следующие товары " );
        for (Goods g: goods
             ) {
            System.out.println(g);
        }

    }
}
