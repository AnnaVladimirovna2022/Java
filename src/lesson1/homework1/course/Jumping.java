package lesson1.homework1.course;

import lesson1.homework1.team.TeamMember;

public class Jumping extends Obstacle_Course {
    public Jumping(int difficulty) {
        super(difficulty);
    }

    public void goMarathon(TeamMember member) {
        member.jumping(super.getDifficulty());
    }
}
