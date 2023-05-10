package lesson10_2;

public class Studio {
    MenClothes[] menClothes;
    WomanClothes[] womanClothes;
    Customer[] customers;


    public void setMenClothes(MenClothes... menClothes) {
        this.menClothes = menClothes;
    }

    public void setWomanClothes(WomanClothes... womanClothes) {
        this.womanClothes = womanClothes;
    }

    public void setCustomers(Customer... customers) {
        this.customers = customers;
    }

    public void createClothesMenu() {
        Tshirt tshirt1 = new Tshirt(Size.L.getEuroSize(), 150, "Белая", "Без руковов");
        Tshirt tshirt2 = new Tshirt(Size.M.getEuroSize(), 200, "Черная", "С руковами");
        Trausers trausers1 = new Trausers(Size.XS.getEuroSize(), 300, "Бежевые", "Клеш");
        Trausers trausers2 = new Trausers(Size.XXS.getEuroSize(), 350, "Синии", "Джинсы");
        Skirt skirt1 = new Skirt(Size.XXS.getEuroSize(), 400, "Красная", "Класика");
        Skirt skirt2 = new Skirt(Size.XS.getEuroSize(), 430, "Зеленая", "Мини");
        Tai tai1 = new Tai(Size.XS.getEuroSize(), 90, "Желтый", "Узкий");
        Tai tai2 = new Tai(Size.XS.getEuroSize(), 110, "Пурпурный", "Широкий");
        setMenClothes(tshirt1, tshirt2, trausers1, trausers2, tai1, tai2);
        setWomanClothes(skirt1, skirt2, trausers1, trausers2);
        studioClothesInfo();
        createCustomers();
        studioCustomerInfo();


    }


    public void createCustomers() {
        Customer customer1 = new Customer("Мужчина", "Андрей", 40);
        Customer customer2 = new Customer("Мужчина", "Иван", 38);
        Customer customer3 = new Customer("Женщина", "Анна", 36);
        Customer customer4 = new Customer("Женщина", "Марина", 34);
        Customer customer5 = new Customer("Женщина", "Ирина", 32);
        Customer customer6 = new Customer("Мужчина", "Глеб", 48);
        setCustomers(customer1, customer2, customer3, customer4, customer5, customer6);
    }


    public void studioClothesInfo() {
        System.out.println("Коллекция мужской одежды :");
        for (MenClothes m : menClothes
        ) {
            System.out.println(m.toString());
        }
        System.out.println("Коллекция женской одежды :");
        for (WomanClothes w : womanClothes
        ) {

            System.out.println(w.toString());
        }
    }

    public void studioStart() {
        for (Customer c : customers
        ) {
            if (c.getKind() == "Женщина") {
                for (WomanClothes w : womanClothes
                ) {

                    System.out.println(c.getName() + " с размером " + c.getSize() + " одевает " + w);
                    w.womanClothe(c.getSize());
                }
            } else {
                for (MenClothes m: menClothes
                     ) {
                    System.out.println(c.getName() + " с размером " + c.getSize() + " одевает " + m);
                    m.menClothe(c.getSize());
                }
            }
        }
    }

    private void studioCustomerInfo() {
        System.out.println("Наши покупатели :");
        for (Customer c : customers
        ) {
            System.out.println(c.toString());
        }

    }


}
