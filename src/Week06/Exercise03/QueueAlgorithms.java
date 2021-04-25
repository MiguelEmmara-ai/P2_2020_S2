package Week06.Exercise03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Miguel Emmara
 */
public class QueueAlgorithms {

    public static Queue<Integer> reverse(Queue<Integer> integers) {
        Stack<Integer> stack = new Stack<>();

        /* will store the reversed queue in the reverse_order */
        Queue<Integer> reverse_order = new LinkedList<>();

        /* first step is to push all queue elements to the stack */
        for (Integer item : integers) {
            stack.push(item);
        }

        /* as second step, pop the elements one by one and add them to reverse_order */
        int stackSize = stack.size();

        for (int i = 0; i < stackSize; i++) {
            reverse_order.add(stack.pop());
        }

        /* return the reversed Queue*/
        return reverse_order;
    }

    public static boolean isPalindrome(Queue<Integer> integers) {
        boolean temp = false;

        if (!integers.isEmpty()) {
            if (integers.equals(reverse(integers))) {
                temp = true;
            }
        }

        return temp;
    }

    public static Integer max(Queue<Integer> integers) {
        // check list is empty or not
        if (integers == null || integers.size() == 0) {
            return Integer.MIN_VALUE;
        }

        return Collections.max(integers);
    }

    public static Integer min(Queue<Integer> integers) {
        // check list is empty or not
        if (integers == null || integers.size() == 0) {
            return Integer.MAX_VALUE;
        }

        return Collections.min(integers);
    }

    public static void main(String[] args) {
        Queue<Integer> line = new LinkedList<>();

        line.add(1);
        line.add(2);
        line.add(3);
        line.add(2);
        line.add(1);

        System.out.println(line);
        System.out.println(reverse(line));

        System.out.println("\nIs palindrome?");
        System.out.println(isPalindrome(line));

        System.out.println("\nMin: " + min(line));
        System.out.println("Max: " + max(line));
    }
}
