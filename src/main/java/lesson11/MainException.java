package lesson11;

public class MainException {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] stringArr1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] stringArr2 = {
                {"17", "18", "19", "20"},
                {"21", "22", "23", "24"},
                {"25", "26", "27"},
                {"28", "29", "30", "31"}};

        String[][] stringArr3 = {
                {"32", "33", "34", "35",},
                {"36", "777", "37", "38",},
                {"39", "40", "41", "42"},
                {"43", "44", "jjj", "46"}};

        String[][] stringArr4 = {
                {"47", "48", "49", "50"},
                {"51", "52", "53", "54"},
                {"55", "56", "57", "58"},
        };

        try {
            System.out.println("Первый массив, правильный");
            arrayException(stringArr1);
//            System.out.println("Второй массив, другого размера");
//            arrayException(stringArr2);
            System.out.println("Третий массив, не все числа");
            arrayException(stringArr3);
            System.out.println("Четвертый массив, другого размера");
            arrayException(stringArr4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void arrayException(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sumArr = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Не верное количество строк");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException("Не верное количество столбцов");
                }
                try {
                    sumArr = sumArr + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    System.out.printf("В строке %d и колонке %d ",i+1,j+1);
                    throw new MyArrayDataException("Не все преобразовалось в INT");


                }

            }

        }
        System.out.println(sumArr);
    }


}
