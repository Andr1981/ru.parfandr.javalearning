package lesson12_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InfoCategoryGoods {



    public void printIfo(PrintCategoriesAndGoods... printCategoriesAndGoods) {
        for (PrintCategoriesAndGoods p : printCategoriesAndGoods
        ) {
            p.printInfo();
        }
    }

    public void printCategoryGodds(Map<Category, List<Goods>> categoryGoodsMap) {
        int count = 0;
        for (Category category : categoryGoodsMap.keySet()
        ) {
            count = count + 1;
            List<Goods> goodsFromMap = new ArrayList<Goods>(categoryGoodsMap.get(category));
            System.out.println(count + " " + category.name + " : ");
            for (int i = 0; i < goodsFromMap.size(); i++) {
                System.out.println((i + 1) + ". " + goodsFromMap.get(i).getName() + " цена - " + goodsFromMap.get(i).getPrise() + " руб.");
            }

        }
    }
    public void printCategoryList(InfoCategoryGoods infoCategoryGoods, ArrayList<Category> categoryArrayList) {
        for (int i = 0; i < categoryArrayList.size(); i++) {
            infoCategoryGoods.printIfo(categoryArrayList.get(i));
        }
    }
}
