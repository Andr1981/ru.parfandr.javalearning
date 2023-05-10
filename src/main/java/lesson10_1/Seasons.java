package lesson10_1;

public enum Seasons {
    SUMMER("Лето, отличное время года", 23){
        public String getMassage() {
            return "Хер вам а не лето))";
        }
    },
    AUTUMN("Осень, грустное время года", 12),
    WINTER("Зима, холодное время года", -25){
        @Override
        public int getTemperature() {
            return -100;
        }
    },
    SPRING("Весна, любимое время года",15);


    private String massage;
    private int temperature;

    Seasons(String massage, int temperature) {
        this.massage = massage;
        this.temperature = temperature;
    }

    public String getMassage() {
        return massage;
    }

    public int getTemperature() {
        return temperature;
    }
}
