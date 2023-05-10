package lesson10;

public class MainClass {

    public static void main(String[] args) {
        Book b1 = new Book("Роман", "Иванов", "Однажды в Америке", 100);
        Book b2 = new Book("Комедия", "Носов", "Незнайка", 50);
        Book b3 = new Book("Детектив", "Пелевин", "Ночной полет", 90);
        Magazine m1 = new Magazine("Мужской", "Radison", "MensHealth", 150);
        Magazine m2 = new Magazine("Женский", "Медия групп", "Лиза", 170);
        Magazine m3 = new Magazine("Детский", "Детский медия Групп", "Лукошко", 120);

        InfoClass infoClass = new InfoClass();

        infoClass.setPrintables(b1, b2, b3, m1, m2, m3);

        infoClass.printInfo();





    }


}
