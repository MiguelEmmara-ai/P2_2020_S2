package Week09.Exercise02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class CustomerPayRoll {
    private static final Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customerArrayList;

    public CustomerPayRoll() {
        customerArrayList = new ArrayList<>();
    }

    public static ArrayList<Customer> inputCustomer() {
        ArrayList<Customer> customerList = new ArrayList<>();
        boolean stop = false;

        System.out.println("Type \"Stop\" To Stop The Program");
        do {
            try {
                System.out.print("What Is Your Name: ");
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("stop")) {
                    stop = true;
                } else {
                    System.out.print("Enter Your Salary: ");
                    int salary = scanner.nextInt();
                    scanner.nextLine();

                    Customer customer = new Customer(name, salary);
                    customerList.add(customer);
                    //Collections.addAll(customerList, new Customer(name,salary));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!stop);

        Collections.sort(customerList);

        return customerList;
    }

    public static void main(String[] args) {
        CustomerPayRoll customerPayRoll = new CustomerPayRoll();

        customerPayRoll.setCustomerArrayList(CustomerPayRoll.inputCustomer());

        System.out.println("\nSorted By Name");
        System.out.println(customerPayRoll);

        customerPayRoll.getCustomerArrayList().sort(Customer.compareBySalary().reversed());
        System.out.println("Sorted By Salary");
        System.out.println(customerPayRoll);
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();

        for (Customer customer : customerArrayList) {
            data.append(customer.getName()).append(" Salary: $").append(customer.getSalary()).append("\n");
        }

        return data.toString();
    }
}
