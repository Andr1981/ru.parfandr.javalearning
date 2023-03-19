package lesson3;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    static int counter = 1;
    static int[][] table = new int[3][4];
    public static Scanner sk = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        printArr(table);
        int z = getNumberFromScanner("Введите число от 0 до 10", 0, 10);
//        Scanner sk = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = sk.nextInt();
//        System.out.print("Введите строку ");
//        String b = sk.next();
//        System.out.print("Введите слово ");
//        String c = sk.next();
//        sk.close();
//        System.out.printf("Ваше число %d\n Ваша строка %s\n Ваше слово %s", a, b, c);
        System.out.println("Ваше число " + z + " лежит в диапозоне от 0 до 10");
    }

    public static int getNumberFromScanner(String massege, int min, int max) {
        int x;
        do {
            System.out.println(massege);
            x = sk.nextInt();

        } while (x < min || x > max);
        return x;

    }

    public static void printArr(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j]);
                counter++;
            }
            System.out.println();
        }
    }


}
