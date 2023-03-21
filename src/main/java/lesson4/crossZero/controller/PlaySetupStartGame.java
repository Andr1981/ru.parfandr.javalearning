package lesson4.crossZero.controller;

import lesson4.crossZero.model.CreatureMap;

import java.util.Random;
import java.util.Scanner;

public class PlaySetupStartGame {
    public static final int DOT_TO_WIN = 3;
    public static Scanner sk = new Scanner(System.in);
    public static CreatureMap crMap = new CreatureMap();
    public static Random rand = new Random();

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sk.nextInt() - 1;
            y = sk.nextInt() - 1;
        } while (!isCellValid(x, y));
        crMap.map[x][y] = crMap.DOT_X;

    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= crMap.SIZE || y < 0 || y >= crMap.SIZE) return false;
        if (crMap.map[x][y] == crMap.DOT_EMPTY) return true;
        return false;

    }


    public static void aiTurn() {
        int x;
        int y;
        do {
            x = rand.nextInt(crMap.SIZE);
            y = rand.nextInt(crMap.SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + (y + 1));
        crMap.map[x][y] = crMap.DOT_O;
    }

    public static boolean checkWin(char symb) {
        if (crMap.map[0][0] == symb && crMap.map[0][1] == symb && crMap.map[0][2] == symb) return true;
        if (crMap.map[1][0] == symb && crMap.map[1][1] == symb && crMap.map[1][2] == symb) return true;
        if (crMap.map[2][0] == symb && crMap.map[2][1] == symb && crMap.map[2][2] == symb) return true;
        if (crMap.map[0][0] == symb && crMap.map[1][0] == symb && crMap.map[2][0] == symb) return true;
        if (crMap.map[0][1] == symb && crMap.map[1][1] == symb && crMap.map[2][1] == symb) return true;
        if (crMap.map[0][2] == symb && crMap.map[1][2] == symb && crMap.map[2][2] == symb) return true;
        if (crMap.map[0][0] == symb && crMap.map[1][1] == symb && crMap.map[2][2] == symb) return true;
        if (crMap.map[2][0] == symb && crMap.map[1][1] == symb && crMap.map[0][2] == symb) return true;
        return false;

    }

    public static void startGame() {
        crMap.initMap();
        crMap.printMap();
        while (true) {
            humanTurn();
            crMap.printMap();
            if (checkWin(crMap.DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            crMap.printMap();
            if (checkWin(crMap.DOT_O)) {
                System.out.println("Выиграл компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра закончена");
    }

    private static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (crMap.map[i][j] == crMap.DOT_EMPTY) return false;
            }

        }
        return true;
    }
}



