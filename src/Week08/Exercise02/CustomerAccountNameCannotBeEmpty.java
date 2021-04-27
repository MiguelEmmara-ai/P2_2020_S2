package Week08.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class CustomerAccountNameCannotBeEmpty extends IllegalArgumentException {

    public CustomerAccountNameCannotBeEmpty(String s) {
        super(s);
    }

    public CustomerAccountNameCannotBeEmpty() {
        super();
    }
}
