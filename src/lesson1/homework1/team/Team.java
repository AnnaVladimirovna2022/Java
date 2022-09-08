package lesson1.homework1.team;

import lesson1.homework1.Status;

public class Team {
    private TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

    public TeamMember[] getMembers() {
        return this.members;
    }

    public void showResults() {
        this.printDivider();
        System.out.println("The obstacle course was passed by the team: " + this.name);
        TeamMember[] var1 = this.members;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TeamMember member = var1[var3];
            if (member.getStatus() == Status.NoPassedDistance) {
                this.showResultMemberNoPassed(member);
            } else {
                this.showResultMemberPassed(member);
            }
        }

        this.printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        this.printDivider();
        System.out.println(member.getName() + " did not pass the obstacle course");
    }

    private void showResultMemberPassed(TeamMember member) {
        this.printDivider();
        System.out.println(member.getName() + " passed the obstacle course successfully");
    }

    private void printDivider() {
        System.out.println("---------------------------------");
    }
}

