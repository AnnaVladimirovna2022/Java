package lesson1.homework1.course;

import lesson1.homework1.team.TeamMember;

public class Shooting extends Obstacle_Course {
    public Shooting(int difficulty) {
        super(difficulty);
    }

    public void goMarathon(TeamMember member) {
        member.shooting(super.getDifficulty());
    }
}


