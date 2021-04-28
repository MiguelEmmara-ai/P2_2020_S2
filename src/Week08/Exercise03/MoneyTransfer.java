package Week08.Exercise03;

import java.util.Date;

/**
 * Created by Miguel Emmara
 */
public class MoneyTransfer {
    private CustomerAccount to;
    private CustomerAccount from;
    private double amount;
    private long timeStamp;

    public MoneyTransfer(CustomerAccount to, CustomerAccount from, double amount) {
        setTo(to);
        setFrom(from);
        setAmount(amount);
        setTimeStamp(System.currentTimeMillis());
    }

    public CustomerAccount getTo() {
        return to;
    }

    public void setTo(CustomerAccount to) {
        this.to = to;
    }

    public CustomerAccount getFrom() {
        return from;
    }

    public void setFrom(CustomerAccount from) {
        this.from = from;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws MoneyTransferException {
        if (amount < 0) {
            MoneyTransferException me = new MoneyTransferException("Transfer amount cannot be negative");
            me.setTimeStamp(this.timeStamp);
            throw me;
        }
        this.amount = amount;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        Date date = new Date(timeStamp);
        String dateString = date.toString();

        return "MoneyTransfer{" +
                "to=" + to +
                ", from=" + from +
                ", amount=" + amount +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
