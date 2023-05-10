package lesson10_2;

public abstract class Clothes {
    public int size;
    public double prise;
    public String color;

    public Clothes(int size, double prise, String color) {
        this.size = size;
        this.prise = prise;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
