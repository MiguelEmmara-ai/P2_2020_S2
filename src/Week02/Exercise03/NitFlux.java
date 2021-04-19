package Week02.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class NitFlux {
    String emailAddress;
    int subscription;
    final double MONTHLY_PRICE = 4.99D;
    ANX bankAccount;

    public NitFlux(String emailAddress, int subscription) {
        this.emailAddress = emailAddress;
        this.subscription = subscription;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getSubscription() {
        return subscription;
    }

    public double computeCustomerPay() {
        return getSubscription() * MONTHLY_PRICE;
    }
}
