package lesson12_1;

import java.util.Scanner;

public class Menu {

    public void menuOptions() {
        System.out.println("Добро пожаловать в интернет магазин продуктов");
        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        while (valid) {
            System.out.println("Введите пункт меню");
            int choiceMenu = scanner.nextInt();
            if (choiceMenu < 1 || choiceMenu > 6) {
                printMenu();
                valid = true;
            } else if (choiceMenu == 1) {
                System.out.println("Поздравляю, вы вошли");
                valid = false;
            }
        }


    }

    private static void printMenu() {
        System.out.println("Для входа нажмите 1");
        System.out.println("Для просмотра списака категорий товаров нажмите 2");
        System.out.println("Для просмотра списака товаров необходимой категории 3");
        System.out.println("Для выбора товаров нажмите 4");
        System.out.println("Для покупки товаров нажмите 5");
        System.out.println("Для выхода нажмите 6");
    }


}
