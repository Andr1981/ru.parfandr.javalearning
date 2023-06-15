package lesson12_1;

import java.util.*;

public class Menu {
    static Map<String, String> menuLoginPasswordMap = new HashMap<String, String>();


    public void menuOptions() {
        System.out.println("Добро пожаловать в интернет магазин продуктов");
        printMenu();
        startMenu();

    }

    private static void startMenu() {
        Scanner scanner = new Scanner(System.in);

        int inputUser = scanner.nextInt();
        startMenuUser(inputUser, scanner);
        scanner.close();

    }

    private static void startMenuUser(int inputUser, Scanner scanner) {
        switch (inputUser) {
            case (1):
                User user = new User();
                user.inputLoginPaasword(scanner);
                menuLoginPasswordMap = user.getLoginPasswordMap();
                printMenu();
                startMenu();
                break;
            case (2):
                InfoCategoryGoods infoCategoryGoods = new InfoCategoryGoods();
                ArrayList<Category> categoryArrayList = (ArrayList<Category>) new Category().makeCategoryList();
                System.out.println("В магазине предствалены следующие категории товаров :");
                infoCategoryGoods.printCategoryList(infoCategoryGoods, categoryArrayList);
                printMenu();
                startMenu();
                break;
            case (3):
                InfoCategoryGoods infoCategoryGoods1 = new InfoCategoryGoods();
                ArrayList<Category> categoryArrayList1 = (ArrayList<Category>) new Category().makeCategoryList();
                ArrayList<Goods> goodsArrayList1 = (ArrayList<Goods>) new Goods().makeGoodsList();
                ArrayList<Goods> goodsListMilk = new ArrayList<Goods>();
                ArrayList<Goods> goodsListMeat = new ArrayList<Goods>();
                Map<Category, List<Goods>> categoryGoodsMap = new HashMap<Category, List<Goods>>();
                createMap(categoryArrayList1, goodsArrayList1, goodsListMilk, goodsListMeat, categoryGoodsMap);
                System.out.println("В магазине предствалены следующие категории и товары к ним : ");
                infoCategoryGoods1.printCategoryGodds(categoryGoodsMap);
                printMenu();
                startMenu();
                break;
            case (4):
                System.out.println("Для начала пакупок необходима авторизация");
                System.out.println("Введите логин :");
                String login = scanner.next();
                System.out.println("Введите пароль :");
                String password = scanner.next();
                boolean validLoginPassword = checkLoginPassword(login, password);
                if (validLoginPassword) {

                    InfoCategoryGoods infoCategoryGoods2 = new InfoCategoryGoods();
                    ArrayList<Category> categoryArrayList2 = (ArrayList<Category>) new Category().makeCategoryList();
                    ArrayList<Goods> goodsArrayList2 = (ArrayList<Goods>) new Goods().makeGoodsList();
                    ArrayList<Goods> goodsListMilk1 = new ArrayList<Goods>();
                    ArrayList<Goods> goodsListMeat1 = new ArrayList<Goods>();
                    Map<Category, List<Goods>> categoryGoodsMap1 = new HashMap<Category, List<Goods>>();
                    createMap(categoryArrayList2, goodsArrayList2, goodsListMilk1, goodsListMeat1, categoryGoodsMap1);
                    System.out.println("В магазине предствалены следующие категории и товары к ним : ");
                    infoCategoryGoods2.printCategoryGodds(categoryGoodsMap1);
                    System.out.println("Введите номер категории товара для его выбора");
                    Basket basket = new Basket();
                    basket.makeBasket(scanner,categoryGoodsMap1);
                } else {
                    System.out.println("Попробуйте еще раз или зарегестрируйтесь");
                    printMenu();
                    startMenu();

                }

                break;

            case (5):
                System.out.println("Покупайте товар");
                break;
            case (6):
                System.out.println("Выход");
                System.exit(0);

            default:
                throw new IllegalStateException("Unexpected value: " + inputUser);
        }


    }



    private static boolean checkLoginPassword(String login, String password) {
        boolean valid = false;
        for (Map.Entry<String, String> entry : menuLoginPasswordMap.entrySet()
        ) {
            if (entry.getKey().equals(login) & entry.getValue().equals(password)) {
                System.out.println("Логин и пароль совпадают");
                valid = true;
            } else {
                System.out.println("Логин и пароль не совпадают");
                valid = false;
            }
        }
        return valid;
    }

    private static void createMap(ArrayList<Category> categoryArrayList1, ArrayList<Goods> goodsArrayList1, ArrayList<Goods> goodsListMilk,
                                  ArrayList<Goods> goodsListMeat, Map<Category, List<Goods>> categoryGoodsMap) {
        for (int i = 0; i < goodsArrayList1.size(); i++) {
            if (goodsArrayList1.get(i).getId() == 1) {
                goodsListMilk.add(goodsArrayList1.get(i));
            } else {
                goodsListMeat.add(goodsArrayList1.get(i));
            }
        }
        for (int i = 0; i < categoryArrayList1.size(); i++) {
            if (categoryArrayList1.get(i).getName().equals("Молочная продукция")) {
                categoryGoodsMap.put(categoryArrayList1.get(i), goodsListMilk);
            } else {
                categoryGoodsMap.put(categoryArrayList1.get(i), goodsListMeat);
            }


        }
    }


    private static void printMenu() {
        System.out.println("Для регистрации пользователя нажмите 1");
        System.out.println("Для просмотра списка категорий товаров нажмите 2");
        System.out.println("Для просмотра списка товаров необходимой категории 3");
        System.out.println("Для выбора товаров нажмите 4");
        System.out.println("Для покупки товаров нажмите 5");
        System.out.println("Для выхода нажмите 6");
    }


}
