package lesson9;

import lesson9.obstacles.Obstacles;
import lesson9.team.Participant;

public class Competition {
    private Obstacles[] obstacles;
    private Participant[] participants;
    private String competitionName = "Веселые старты";


    public void setObstacles(Obstacles... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void startCompetition() {

        System.out.printf("%nНачало соревнований%n");
        for (Participant participant : participants) {
            boolean success = PassAllObstacles(participant);
            if (!success) {
                System.out.println("Участник " + participant.toString() + " покинул испытание");
            } else {
                System.out.println("Участник " + participant.toString() + " прошел испытание");
            }
        }
    }

    private boolean PassAllObstacles(Participant participant) {
        for (Obstacles obstacles : obstacles) {
            if (!obstacles.passOnotPass(participant)) {
                return false;
            }
            System.out.println();

        }
        return true;

    }
}
