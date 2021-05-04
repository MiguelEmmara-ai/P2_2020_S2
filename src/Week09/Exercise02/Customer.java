package Week09.Exercise02;

import java.util.Comparator;

/**
 * Created by Miguel Emmara
 */
public class Customer implements Comparable<Customer> {
    private String name;
    private Integer salary;

    public Customer(String name, int salary) {
        setName(name);
        setSalary(salary);
    }

    static public Comparator<Customer> compareBySalary() {
        return Comparator.comparing(Customer::getSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Customer o) {
        return this.getName().compareTo(o.getName());
    }
}
