package lesson12_1;



public class Basket {
    private Goods[] basketGoods;

    public Goods[] getBasketGoods() {
        return basketGoods;
    }

    public void setBasketGoods(Goods[] basketGoods) {
        this.basketGoods = basketGoods;
    }
    public void printUserBasketGoods(User user){
        System.out.println("Покупатель с ником " + user.getLogin() + " купил следующие товары ");
        for (Goods b: basketGoods
             ) {
            System.out.println(b.getName() + " по цене " + b.getPrise() + " руб.");
        }
    }


}
