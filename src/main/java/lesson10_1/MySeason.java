package lesson10_1;

import java.util.Arrays;

import static lesson10_1.Seasons.values;

public class MySeason {


    public static void main(String[] args) {
        for (Seasons s : Seasons.values()
        ) {
            mySeasonsPrint(s);
            System.out.println(s.getMassage() + " " + s.ordinal());
        }
        System.out.println(Seasons.valueOf("WINTER"));
        System.out.println(values().length);

    }


    public static void mySeasonsPrint(Seasons seasons) {
        switch (seasons) {
            case AUTUMN:
                System.out.println("Осень, отвратительное время года, не люблю его, средняя температура " + Seasons.AUTUMN.getTemperature() + " градусов");
                break;
            case SPRING:
                System.out.println("Весна, мое любимое время года, потому что все расцветает, средняя температура " + Seasons.SPRING.getTemperature() + " градусов");
                break;
            case SUMMER:
                System.out.println("Лето- просто классно, средняя температура " + Seasons.SUMMER.getTemperature() + " градусов");
                break;
            case WINTER:
                System.out.println("Ну зима есть зима, средняя температура " + Seasons.WINTER.getTemperature() + " градусов");
        }
    }


}
