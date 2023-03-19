package lesson3.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arrTask2 = new int[100];
        for (int i = 0; i < arrTask2.length; i++) {
            arrTask2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrTask2));
    }
}
