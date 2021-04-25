package Week03.Exercise04;

/**
 * Created by Miguel Emmara
 */
public class RugbyScore {
    private String nameOfTeam;
    private int currentPoints;

    public RugbyScore(String nameOfTeam) {
        setNameOfTeam(nameOfTeam);
        setCurrentPoints(0);
    }

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public void score(ScoreAction scoreAction) {
        setCurrentPoints(getCurrentPoints() + scoreAction.getPointIncrease());
    }

    @Override
    public String toString() {
        return "Name Of Teams: " + getNameOfTeam() + ", Current Points: " + getCurrentPoints();
    }
}
