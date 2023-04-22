package lesson9.team;

import lesson9.Competition;
import lesson9.obstacles.Treadmill;
import lesson9.obstacles.Wall;

public class TeamObstacle {
    private String[] teamArrName = new String[6];

    public void creatureTeamObstacle() {
        Human human1 = new Human("Человек", "Andrey", 30, 7);
        Human human2 = new Human("Человек", "Boris", 50, 4);
        Cat cat1 = new Cat("Кот", "Barsik", 40, 8);
        Cat cat2 = new Cat("Кот", "Mursik", 30, 7);
        Robot robot1 = new Robot("Робот", "Robocop", 100, 10);
        Robot robot2 = new Robot("Робот", "Verter", 90, 9);
        String[] teamNames = {human1.getKind() + " " + human1.getName(), human2.getKind() + " " + human2.getName(),
                cat1.getKind() + " " + cat1.getName(), cat2.getKind() + " " + cat2.getName(), robot1.getKind() + " " + robot1.getName(),
                robot2.getKind() + " " + robot2.getName()};
        System.out.println("Наши участники:");
        for (int i = 0; i < teamNames.length; i++) {
            System.out.printf("%s%n", teamNames[i]);
        }
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        System.out.printf("Полоса препятсвий создана и это стена, высотой - %d м. и дорожка, дистанцией %d м.%n", wall.getHight(), treadmill.getDistance());

        Competition competition = new Competition();
        competition.setParticipants(human1, human2, cat1, cat2, robot1, robot2);
        competition.setObstacles(wall,treadmill);
        competition.startCompetition();

    }


}
