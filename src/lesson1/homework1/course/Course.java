package lesson1.homework1.course;

import lesson1.homework1.Status;
import lesson1.homework1.team.Team;
import lesson1.homework1.team.TeamMember;

public class Course {
    private Obstacle_Course[] obstacles;

    public Course(Obstacle_Course... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        TeamMember[] var2 = team.getMembers();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            TeamMember member = var2[var4];
            Obstacle_Course[] var6 = this.obstacles;
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                Obstacle_Course obs = var6[var8];
                obs.goMarathon(member);
                if (member.getStatus() == Status.NoPassedDistance) {
                    break;
                }
            }
        }
    }
}
