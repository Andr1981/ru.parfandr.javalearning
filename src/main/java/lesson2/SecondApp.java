package lesson2;

public class SecondApp {
    static int x;
    static int y;
    static int z;
    static String var;
    static int n;
        static int userYear;

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == 0 | i == 4) {
//                    System.out.print("0");
//                } else if (j == 0 | j == 9) {
//                    System.out.print("0");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print("0");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (i > j) {
//                    System.out.print("0");
//                } else if (i < j) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0 | i == 4) {
//                    System.out.printf("%d\t", 0);
//                } else if (j == 0 | j == 4 | i == j) {
//                    System.out.printf("%d\t", 0);
//                } else {
//                    System.out.printf("%s\t", "*");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 4 | i == j | j == 0) {
//                    System.out.printf("%d\t", 0);
//                } else {
//                    System.out.printf("%s\t", " ");
//                }
//            }
//            System.out.println();
//        }

        System.out.println(checkSumm(15, 2));
        chekPozNegNumber(0);
        System.out.println(check(5));
        var = "Привет";
        n = 5;
        stringNumber(var, n);
        userYear = 2047;
        if (ifYearvisakos(userYear)== true){
            System.out.println("Год является високосным");
        }  else {
            System.out.println("Год является не високосным");
        }

    }

    public static boolean checkSumm(int x, int y) {
        if ((x + y) > 10 & (x + y) < 20)
            return true;
        else
            return false;
    }

    public static void chekPozNegNumber(int x) {
        if (x >= 0) {
            System.out.println("Данное число: " + x + " является положительным");
        } else {
            System.out.println("Данное число: " + x + " является отрицательным");
        }

    }

    public static boolean check(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }

    public static void stringNumber(String var, int n) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(var);
        }

    }

    public static boolean ifYearvisakos(int userYear) {
        if (userYear % 4 == 0 | userYear % 400 ==0 | userYear % 100 == 0)
            return true;
        else
            return false;

    }

}
