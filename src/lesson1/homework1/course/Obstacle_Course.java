package lesson1.homework1.course;

import lesson1.homework1.team.TeamMember;

public abstract class Obstacle_Course {
    private final int difficulty;

    public Obstacle_Course(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return this.difficulty;
    }

    public void goMarathon(TeamMember member) {
    }
}
