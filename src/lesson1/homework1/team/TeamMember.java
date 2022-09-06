package lesson1.homework1.team;

import lesson1.homework1.Status;

public class TeamMember {
    private Status status;
    private final String name;
    private final int power;

    public TeamMember(String name, int power) {
        this.status = Status.NoPassedDistance;
        this.name = name;
        this.power = power;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getName() {
        return this.name;
    }

    public void shooting(int courseDifficulty) {
        if (this.checkPower(courseDifficulty)) {
            this.changeStatus(Status.PassedDistance, " won the shooting");
        } else {
            this.changeStatus(Status.NoPassedDistance, " lost the shooting");
        }
    }

    public void jumping(int courseDifficulty) {
        if (this.checkPower(courseDifficulty)) {
            this.changeStatus(Status.PassedDistance, " got the height");
        } else {
            this.changeStatus(Status.NoPassedDistance, " didn't get the height");
        }
    }

    public void running(int courseDifficulty) {
        if (this.checkPower(courseDifficulty)) {
            this.changeStatus(Status.PassedDistance, " run the distance");
        } else {
            this.changeStatus(Status.NoPassedDistance, " didn't run the distance");
        }
    }

    public void swimming(int courseDifficulty) {
        if (this.checkPower(courseDifficulty)) {
            this.changeStatus(Status.PassedDistance, " swam the distance");
        } else {
            this.changeStatus(Status.NoPassedDistance, " didn't swim the distance");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return this.power > courseDifficulty || this.power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        this.status = newStatus;
        System.out.println(this.name + message);
    }
}
