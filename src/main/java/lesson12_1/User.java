package lesson12_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class User {
    private String login;
    private String password;
    Basket b1 = new Basket();
    Map<String, String> loginPasswordMap = new HashMap<String, String>();

    public User() {

    }

    public void inputLoginPaasword(Scanner scanner) {

        System.out.println("Введите логин : ");
        this.login = scanner.next();
        System.out.println("Введите пароль : ");
        this.password = scanner.next();
        checkLoginPassword(login,password);

    }


    public void checkLoginPassword(String l, String p) {
        loginPasswordMap.put(l, p);
        System.out.println("Поздравляю, вы зарегестрировались!\nВаш логин " + loginPasswordMap.keySet() + ", ваш пароль " + loginPasswordMap.values());
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

    public Map<String, String> getLoginPasswordMap() {
        return loginPasswordMap;
    }

    public void setLoginPasswordMap(Map<String, String> loginPasswordMap) {
        this.loginPasswordMap = loginPasswordMap;
    }
}
