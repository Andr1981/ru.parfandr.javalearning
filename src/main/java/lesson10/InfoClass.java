package lesson10;

import static lesson10.Book.printBook;
import static lesson10.Magazine.printMagazine;

public class InfoClass {
    Printable[] printables;

    public void setPrintables(Printable... printables) {
        this.printables = printables;
    }

    void printInfo() {
        for (Printable p : printables) {
            p.print();
        }
        printMagazine(printables);
        printBook(printables);
    }


}
