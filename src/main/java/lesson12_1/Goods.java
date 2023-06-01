package lesson12_1;

public class Goods {
    private String name;
    private  double prise;
    private  int rating;

    public Goods(String name, double prise, int rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }





    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", rating=" + rating +
                '}';
    }
}
