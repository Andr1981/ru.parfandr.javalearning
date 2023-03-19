package lesson3.homework;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = {0, 1, 1, 0, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 2);
        }
//        System.out.println(Arrays.toString(arr1));
        System.out.println("Исходный массив     " + Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                arr2[i] = 1;
            } else arr2[i] = 0;

        }
        System.out.println("Переделанный массив " + Arrays.toString(arr2));
    }


}
