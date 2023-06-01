package lesson12;

import java.util.*;

public class TelDirectory {
    String nameValue;
    String numberKey;

    public static void main(String[] args) {
        Map<String, String> telDir = new HashMap<String, String>();
        telDir.put("+79263958877", "Anna");
        telDir.put("+79325569987", "Andrey");
        telDir.put("+78542237711", "Dennis");
        telDir.put("+79164489923", "Anna");
        telDir.put("+79263958878", "Mihail");
        telDir.put("+79256978524", "Elena");

        System.out.println(telDir.size() + "\n" + telDir.isEmpty() + "\n" + telDir);
        System.out.println(telDir.get("+79263958877"));
        System.out.println(telDir.containsValue("Anna"));
        System.out.println("Обход мапы циклом");
        for (Map.Entry entry: telDir.entrySet()
             ) {
            System.out.println(entry);
        }
        findKeyFromValue(telDir);


    }

    private static void findKeyFromValue(Map<String, String> telDir) {
        for (String key: telDir.keySet()
             ) {
            if (telDir.get(key).equals("Anna")){
                System.out.println("Ключ " + key + " " + telDir.get(key));
            }
        }
    }
}
