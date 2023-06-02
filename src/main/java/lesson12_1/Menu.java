package lesson12_1;

import java.util.Scanner;

public class Menu {

    public void menuOptions() {
        System.out.println("Добро пожаловать в интернет магазин продуктов");
        printMenu();
        startMenu();

    }

    private static void startMenu() {
        Scanner choiceMenu = new Scanner(System.in);
        boolean valid = true;
        while (valid) {
            System.out.println("Введите пункт меню");
            if (choiceMenu.hasNextInt()) {
                int inputUser = choiceMenu.nextInt();
                if (inputUser < 1 || inputUser > 6) {
                    System.out.println("Вы ввели не верное число");
                    printMenu();
                    choiceMenu.nextLine();
                    valid = true;
                } else {
                    startMenuUser(inputUser);
                    valid = false;
                    choiceMenu.close();
                }
            } else {
                System.out.println("Вы ввели не число");
                printMenu();
                choiceMenu.nextLine();
                valid = true;
            }

        }
    }

    private static void startMenuUser(int inputUser) {
        switch (inputUser) {
            case (1):
                System.out.println("Поздравляю, вы вошли");
                User user1 = new User();
                printMenu();
                startMenu();
                break;
            case (2):
                InfoCategoryGoods infoCategoryGoods = new InfoCategoryGoods();
                Category milkCategory = new Category("Молочная продукция");
                Category meatCategory = new Category("Мясная продукция");
                infoCategoryGoods.setCategoriesAndGoodsArr(milkCategory, meatCategory);
                System.out.println("В магазине предствалены следующие категории товаров :");
                infoCategoryGoods.printIfo(infoCategoryGoods.categoriesAndGoodsArr);
                printMenu();
                startMenu();
                break;
            case (3):
                InfoCategoryGoods infoCategoryGoods1 = new InfoCategoryGoods();
                Goods milkGood1 = new Goods("Молоко Простоквашено", 85.00, 2);
                Goods milkGood2 = new Goods("Молоко Зеленый Луг", 105.00, 1);
                Goods milkGood3 = new Goods("Молоко Домик в деревне", 90.00, 3);
                Goods meatGood1 = new Goods("Сосиски Молочные", 235.00, 8);
                Goods meatGood2 = new Goods("Сосиски Клинские", 250.00, 7);
                infoCategoryGoods1.setCategoriesAndGoodsArr(milkGood1, milkGood2, milkGood3, meatGood1, meatGood2);
                System.out.println("В магазине предствалены следующие товары :");
                infoCategoryGoods1.printIfo(infoCategoryGoods1.categoriesAndGoodsArr);
                printMenu();
                startMenu();
                break;
            case (4):
                System.out.println("Выбирайте товар");
                break;
            case (5):
                System.out.println("Покупайте товар");
                break;
            case (6):
                System.out.println("Выход");
                System.exit(0);

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
