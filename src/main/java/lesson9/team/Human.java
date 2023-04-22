package lesson9.team;

public class Human implements Participant {
    private String kind;
    private String name;
    private int distance;
    private int hight;

    public String getKind() {
        return kind;
    }

    public Human(String kind, String name, int distance, int hight) {
        this.kind = kind;
        this.name = name;
        this.distance = distance;
        this.hight = hight;
    }


    public int run() {

        System.out.println(this.getKind() + " " + this.getName() + " бежит дистанцию = " + distance);
        return distance;
    }

    public int jump() {
        System.out.println(this.getKind() + " " + this.getName() + " прыгает на высоту = " + hight);
        return hight;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return distance;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return " " +
                " " + kind + ' ' +
                " " + name + ' ' +

                ' ';
    }
}
