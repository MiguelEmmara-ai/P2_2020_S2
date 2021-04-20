package Week03.Exercise04;

/**
 * Created by Miguel Emmara
 */
public class RugbyMatch {
    private RugbyScore homeTeam;
    private RugbyScore oppositionTeam;

    public RugbyMatch(RugbyScore homeTeam, RugbyScore oppositionTeam) {
        this.homeTeam = homeTeam;
        this.oppositionTeam = oppositionTeam;
    }

    public RugbyScore getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(RugbyScore homeTeam) {
        this.homeTeam = homeTeam;
    }

    public RugbyScore getOppositionTeam() {
        return oppositionTeam;
    }

    public void setOppositionTeam(RugbyScore oppositionTeam) {
        this.oppositionTeam = oppositionTeam;
    }

    public void homeScore (ScoreAction scoreAction) {
        homeTeam.score(scoreAction);
    }

    public void oppositionScore (ScoreAction scoreAction) {
        oppositionTeam.score(scoreAction);
    }

    public RugbyScore winner() {
        if (homeTeam.getCurrentPoints() > oppositionTeam.getCurrentPoints()) {
            return homeTeam;
        } else if (homeTeam.getCurrentPoints() < oppositionTeam.getCurrentPoints()) {
            return oppositionTeam;
        } else if (homeTeam.getCurrentPoints() == oppositionTeam.getCurrentPoints()) {
            return null;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";

        if (winner() == homeTeam) {
            str += homeTeam.getNameOfTeam();
            str += " won over " + oppositionTeam.getNameOfTeam();
            str += " " + homeTeam.getCurrentPoints();
            str += " - " + oppositionTeam.getCurrentPoints();
        } else if (winner() == oppositionTeam) {
            str += oppositionTeam.getNameOfTeam();
            str += " won over " + homeTeam.getNameOfTeam();
            str += " " + oppositionTeam.getCurrentPoints();
            str += " - " + homeTeam.getCurrentPoints();
        } else if (winner() == null) {
            str += homeTeam.getNameOfTeam();
            str += " tied with " + oppositionTeam.getNameOfTeam();
            str += " " + homeTeam.getCurrentPoints();
            str += " points";
        }

        return str;
    }
}
