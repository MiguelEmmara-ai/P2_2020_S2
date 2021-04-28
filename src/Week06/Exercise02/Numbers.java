package Week06.Exercise02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Miguel Emmara
 */
public class Numbers {
    private final ArrayList<Integer> list;

    public Numbers() {
        this.list = new ArrayList<>();
    }

    public void addNumber(Integer i) {
        this.list.add(i);
    }

    public void clear() {
        this.list.clear();
    }

    public void printList() {
        System.out.println(this.list);
    }

    public Integer min() {
        // check list is empty or not
        if (this.list == null || this.list.size() == 0) {
            return Integer.MAX_VALUE;
        }

        return Collections.min(list);
    }

    public Integer max() {
        // check list is empty or not
        if (this.list == null || this.list.size() == 0) {
            return Integer.MIN_VALUE;
        }

        return Collections.max(list);
    }
}
