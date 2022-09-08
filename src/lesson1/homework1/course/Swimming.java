package lesson1.homework1.course;

import lesson1.homework1.team.TeamMember;

public class Swimming extends Obstacle_Course {
    public Swimming(int difficulty) {
        super(difficulty);
    }

    public void goMarathon(TeamMember member) {
        member.swimming(super.getDifficulty());
    }
}
