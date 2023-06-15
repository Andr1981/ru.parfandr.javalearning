package lesson12_1;


import java.util.*;

public class Basket {
    private ArrayList<Goods> basketGoods = new ArrayList<Goods>();


    public ArrayList<Goods> makeBasket(Scanner scanner, Map<Category, List<Goods>> categoryGoodsMap1) {
        int command = scanner.nextInt();
        switch (command) {
            case (1):
                System.out.println("Вы выбрали категорию Мясная продукция :");
                for (Category category : categoryGoodsMap1.keySet()
                ) {
                    if (category.name.equals("Мясная продукция")) {
                        List<Goods> goodsList = new ArrayList<Goods>(categoryGoodsMap1.get(category));
                        System.out.println("Введите номер товара для покупки :");
                        for (int i = 0; i < goodsList.size(); i++) {
                            System.out.println((i + 1) + " " + goodsList.get(i).getName() + " -" + goodsList.get(i).getPrise() + " руб.");
                        }
                        int choiceGood = scanner.nextInt();
                        if (choiceGood == 1) {
                            basketGoods.add(goodsList.get(0));
                            System.out.println("В корзине :\n - " + basketGoods.get(0).getName() + " " + basketGoods.get(0).getPrise() + " руб.");
                            System.out.println("Для оформления покупки введите соответствующий пункт меню");

                        }
                    }
                }

                break;
        }
        return basketGoods;
    }
}
