package lesson1.homework1.course;

import lesson1.homework1.team.TeamMember;

public class Running extends Obstacle_Course {
    public Running(int difficulty) {
        super(difficulty);
    }

    public void goMarathon(TeamMember member) {
        member.running(super.getDifficulty());
    }
}

