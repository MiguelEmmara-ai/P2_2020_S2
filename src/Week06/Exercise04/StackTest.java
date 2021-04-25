package Week06.Exercise04;

import java.util.Stack;

/**
 * Created by Miguel Emmara
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        Integer i = stack.pop();
        Integer j = stack.pop();
        System.out.println(i);
        System.out.println(j);

        MaxMinStack maxMinStack = new MaxMinStack();
        maxMinStack.push(1);
        maxMinStack.push(2);
        maxMinStack.push(3);
        System.out.println("Max: " + maxMinStack.getMax());
        System.out.println("Min: " + maxMinStack.getMin());
    }
}
