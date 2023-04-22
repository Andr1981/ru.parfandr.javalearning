package lesson9.obstacles;

import lesson9.team.Participant;

public class Wall implements Obstacles {
    private int hight = (int) (Math.random()*10);

    public int getHight() {
        return hight;
    }

    public boolean passOnotPass(Participant participant) {
        if (participant.jump() < hight) {
            System.out.println("Участник " + participant + " не перепрыгнул стену высотой " + getHight() + " м.");
            return false;
        } else {
            System.out.println("Участник " + participant + " перепрыгнул стену выстой " + getHight() + " м.");
            return true;
        }
    }
}
