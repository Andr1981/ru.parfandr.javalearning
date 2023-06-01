package lesson12_1;

public class internetShopMain {

    public static void main(String[] args) {
        Goods milkGood1 = new Goods("Молоко Простоквашено", 85.00, 2);
        Goods milkGood2 = new Goods("Молоко Зеленый Луг", 105.00, 1);
        Goods milkGood3 = new Goods("Молоко Домик в деревне", 90.00, 3);
        Goods meatGood1 = new Goods("Сосиски Молочные", 235.00, 8);
        Goods meatGood2 = new Goods("Сосиски Клинские", 250.00, 7);
        Category milkCategory = new Category("Milk");
        Category meatCategory = new Category("Meat");
        User user1 = new User("Andr-AA", "123456");
        User user2 = new User("Trigub-NN", "987654");
        milkCategory.setGoods(new Goods[]{milkGood1, milkGood2, milkGood3});
        meatCategory.setGoods(new Goods[]{meatGood1, meatGood2});
        user1.b1.setBasketGoods(new Goods[]{milkGood1,meatGood2});
        user2.b1.setBasketGoods(new Goods[]{milkGood3,meatGood1});
        user1.b1.printUserBasketGoods(user1);
        user2.b1.printUserBasketGoods(user2);



    }


}
