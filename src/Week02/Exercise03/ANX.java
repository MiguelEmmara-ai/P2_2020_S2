package Week02.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class ANX {
    String customerName;
    int accountCode;

    public ANX(String customerName, int accountCode) {
        this.customerName = customerName;
        this.accountCode = accountCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(int accountCode) {
        this.accountCode = accountCode;
    }
}
