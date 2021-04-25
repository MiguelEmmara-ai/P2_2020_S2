package Week02.Exercise03;

import java.text.DecimalFormat;

/**
 * Created by Miguel Emmara
 */
public class NitFluxTest {
    public static void main(String[] args) {
        DecimalFormat dp2 = new DecimalFormat("#.##");

        NitFlux account1 = new NitFlux("miguelemmara@gmail.com", 5);
        account1.bankAccount = new ANX("Miguel Emmara", 12345);

        NitFlux account2 = new NitFlux("steverogers@gmail.com", 10);
        account2.bankAccount = new ANX("Steve Rogers,", 12346);

        NitFlux account3 = new NitFlux("tonystark@gmail.com", 15);
        account3.bankAccount = new ANX("Tony Stark", 12347);

        System.out.println(account1.bankAccount.getCustomerName() + " - Account 1");
        System.out.println("Email: " + account1.getEmailAddress() + "\nSubscription: " + account1.getSubscription() +
                " Months" + "\nTotal Price: $" + dp2.format(account1.computeCustomerPay()));

        System.out.println("\n" + account2.bankAccount.getCustomerName() + " - Account 2");
        System.out.println("Email: " + account2.getEmailAddress() + "\nSubscription: " + account2.getSubscription() +
                " Months" + "\nTotal Price: $" + dp2.format(account2.computeCustomerPay()));

        System.out.println("\n" + account2.bankAccount.getCustomerName() + " - Account 3");
        System.out.println("Email: " + account3.getEmailAddress() + "\nSubscription: " + account3.getSubscription() +
                " Months" + "\nTotal Price: $" + dp2.format(account3.computeCustomerPay()));
    }
}
