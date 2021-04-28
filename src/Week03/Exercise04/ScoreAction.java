package Week03.Exercise04;

/**
 * Created by Miguel Emmara
 */
public enum ScoreAction {
    TRY(5), CONVERSIONKICK(2), PENALTYKICK(3), DROPGOAL(3);
    private final int pointIncrease;

    ScoreAction(int pointIncrease) {
        this.pointIncrease = pointIncrease;
    }

    public int getPointIncrease() {
        return pointIncrease;
    }
}
