package lesson12_1;

public class InfoCategoryGoods {
    PrintCategoriesAndGoods[] categoriesAndGoodsArr;

    public PrintCategoriesAndGoods[] getCategoriesAndGoodsArr() {
        return categoriesAndGoodsArr;
    }

    public void setCategoriesAndGoodsArr(PrintCategoriesAndGoods... categoriesAndGoodsArr) {
        this.categoriesAndGoodsArr = categoriesAndGoodsArr;
    }

    public void printIfo(PrintCategoriesAndGoods... printCategoriesAndGoods) {
        for (PrintCategoriesAndGoods p : printCategoriesAndGoods
        ) {
            p.printInfo();
        }
    }
}
