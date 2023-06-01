package lesson12_1;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    Basket b1 = new Basket();

    public User() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин :");
        this.login = scanner.next();
        System.out.println("Введите пароль");
        this.password = scanner.next();


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
