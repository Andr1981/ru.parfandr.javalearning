package lesson9.obstacles;

import lesson9.team.Participant;

public class Treadmill implements Obstacles {
    private int distance = (int) (Math.random()*100);;

    public int getDistance() {
        return distance;
    }

    public boolean passOnotPass(Participant participant) {

        if (participant.run() < distance) {
            System.out.println("Участник " + participant + " не пробежал дистанцию в " + getDistance() + " м.");
            return false;
        } else {
            System.out.print("Участник " + participant + " пробежел дистанцию в " + getDistance() + " м.");
            return true;
        }

    }
}
