package lesson3.homework;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String[][] arrTask4 = new String[8][8];
        for (int i = 0; i < arrTask4.length; i++) {
            for (int j = 0; j < arrTask4[i].length; j++) {
                if (i == j || (((i+1)+j) % arrTask4[0].length==0)) arrTask4[i][j] = "W";
                else arrTask4[i][j] = " ";
                System.out.print(" " + arrTask4[i][j] + " ");
            }
            System.out.println();
        }

    }
}
