package Week08.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class MoneyTransferException extends IllegalArgumentException {
    private long timeStamp;

    public MoneyTransferException(String s) {
        super(s);
    }

    public MoneyTransferException() {
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
