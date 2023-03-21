package lesson5;

import java.util.Arrays;

public class MainEmployeeClass {


    public static void main(String[] args) {

        Employee[] personArray = new Employee[4];
        personArray[0] = new Employee("Ivanjv Ivan", "Manager", "ivanov@mail.ru", "89261112233", 120000, 30);
        personArray[1] = new Employee("Sidoriv Sergey", "Ingeneir", "sidorov@mail.ru", "89262223344", 135000, 42);
        personArray[2] = new Employee("Petrov Petr", "Asistent", "pterov@mail.ru", "89263334455", 90000, 27);
        personArray[3] = new Employee("Belov Boris", "Director", "belov@mail.ru", "89265556677", 185000, 47);


        for (int i = 0; i < 4; i++) {
            if (personArray[i].getAge() > 40) {
                System.out.println(i + " " + personArray[i].getFio() + " " + personArray[i].getPost() + " " + personArray[i].getEmail() + " " + personArray[i].getPhoneNumber() + " " + personArray[i].getSalary() + " " + personArray[i].getAge());
            }

        }

    }


}
