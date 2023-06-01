package lesson12;

import java.util.ArrayList;
import java.util.List;


public class CollectionMainAp {

    public static void main(String[] args) {
        String[] wordArr = {"One", "Two", "Three", "Four", "Five", "Three", "Six", "Three", "Seven", "Two"};
        List<String> wordList = creatureArrList(wordArr);
        System.out.println("Количество слов в листе -  " + wordList.size());
        System.out.println(wordList);
        unicomWordsCreature(wordList);
        unicomMapWordsCreature(wordArr);

    }

    


    private static void unicomWordsCreature(List<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i) == wordList.get(j)) {
                    wordList.remove(j);
                }
            }

        }
        System.out.println("Список уникальных слов");
        System.out.println(wordList);
    }

    private static List<String> creatureArrList(String[] wordArr) {
        List<String> wordList = new ArrayList();
        for (int i = 0; i < wordArr.length; i++) {
            wordList.add(wordArr[i]);
        }
        return wordList;
    }

    private static void unicomMapWordsCreature(String[] wordArr) {
        List<String> wordList1 = creatureArrList(wordArr);
        int count = 0;
        for (int i = 0; i < wordList1.size(); i++) {
            for (int j = i + 1; j < wordList1.size(); j++) {
                if (wordList1.get(i) == wordList1.get(j)) {
                    count++;
                    wordList1.remove(j);
                }

            }

            if (count != 0) {
                System.out.println("Слово " + wordList1.get(i) + " встречается " + (count + 1) + " раз");
                count = 0;
            } else {
                System.out.println("Слово " + wordList1.get(i) + " встречается 1 раз");
            }


        }

    }
}
