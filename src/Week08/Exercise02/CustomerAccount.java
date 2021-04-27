package Week08.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class CustomerAccount {
    private String customer_name;

    public CustomerAccount(String customer_name) {
        setCustomer_name(customer_name);
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "customer_name='" + customer_name + '\'' +
                '}';
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        // Null
        if (customer_name == null) {
            throw new CustomerAccountNameCannotBeNull("Customer name parameter is null");
            // Empty String
        } else if (customer_name.equals("")) {
            throw new CustomerAccountNameCannotBeEmpty("Customer name parameter is an empty string");
        } else {
            this.customer_name = customer_name;
        }
    }
}
