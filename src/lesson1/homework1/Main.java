package lesson1.homework1;

import lesson1.homework1.course.*;
import lesson1.homework1.team.Team;
import lesson1.homework1.team.TeamMember;

public class Main {
    public static void main(String[] args) {
        Team someTeam = new Team("Spartak",
                new TeamMember("Maslov", 6),
                new TeamMember("Rasskazov", 5),
                new TeamMember("Zinkovsky", 4),
                new TeamMember("Ignatov", 7));
        Course course = new Course(
                new Running(5),
                new Swimming(3),
                new Shooting(6),
                new Jumping(2));

        course.doIt(someTeam);
    }
}

