package lesson12_1;

public enum MenuEnunPoints {
    ENTER(1),
    CATEGORY(2),
    CATEGORY_GOODS(3),
    CHOICE_GOODS(4),
    BUY_GOODS(5),
    EXIT(6);
    private int number;

    MenuEnunPoints(int number) {
        this.number = number;
    }
}
