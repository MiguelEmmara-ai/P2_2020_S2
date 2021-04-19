package Week03.Exercise04;

/**
 * Created by Miguel Emmara
 */
public class RugbyScoreTest {
    public static void main(String[] args) {
        /*RugbyScore blues = new RugbyScore("Blues");
        System.out.println(blues);
        blues.score(ScoreAction.TRY);
        System.out.println(blues);
        blues.score(ScoreAction.DROPGOAL);
        System.out.println(blues);*/

        RugbyScore blues = new RugbyScore("Blues");
        RugbyScore highlanders = new RugbyScore("Highlanders");

        RugbyMatch rugbyMatch = new RugbyMatch(blues,highlanders);

        // homeTeam Wins
        /*rugbyMatch.homeTeam.score(ScoreAction.TRY);
        rugbyMatch.homeTeam.score(ScoreAction.TRY);
        rugbyMatch.oppositionTeam.score(ScoreAction.TRY);
        rugbyMatch.oppositionTeam.score(ScoreAction.CONVERSIONKICK);
        rugbyMatch.oppositionTeam.score(ScoreAction.CONVERSIONKICK);
        System.out.println(rugbyMatch);*/

        // Tied
        rugbyMatch.homeTeam.score(ScoreAction.TRY);
        rugbyMatch.oppositionTeam.score(ScoreAction.TRY);
        System.out.println(rugbyMatch);
    }
}
