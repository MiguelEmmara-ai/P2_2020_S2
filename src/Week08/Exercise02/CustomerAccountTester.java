package Week08.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class CustomerAccountTester {
    public static void main(String[] args) {

        try {
            CustomerAccount c1 = new CustomerAccount("Herr Mustermann");
            // Null
            c1.setCustomer_name(null);

            // Empty String
            // c1.setCustomer_name("");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}