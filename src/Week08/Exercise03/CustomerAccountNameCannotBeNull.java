package Week08.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class CustomerAccountNameCannotBeNull extends IllegalArgumentException {
    public CustomerAccountNameCannotBeNull(String s) {
        super(s);
    }

    public CustomerAccountNameCannotBeNull() {
        super();
    }
}
