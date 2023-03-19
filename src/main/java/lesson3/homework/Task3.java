package lesson3.homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrTask3 = new int[30];

        for (int i = 0; i < arrTask3.length; i++) {
            arrTask3[i] = (int) (Math.random() * 10);
        }
        System.out.println("Исходный массив   " + Arrays.toString(arrTask3));

        for (int i = 0; i < arrTask3.length; i++) {
            if (arrTask3[i] < 6) {
                arrTask3[i] = arrTask3[i] * 2;
            }
        }
        System.out.println("Полученный массив " + Arrays.toString(arrTask3));
    }
}
