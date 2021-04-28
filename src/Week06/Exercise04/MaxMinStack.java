package Week06.Exercise04;

import java.util.Stack;

/**
 * Created by Miguel Emmara
 */
public class MaxMinStack {
    private final Stack<Integer> max;
    private final Stack<Integer> min;
    private final Stack<Integer> stack;

    public MaxMinStack() {
        this.max = new Stack<>();
        this.min = new Stack<>();
        this.stack = new Stack<>();
    }

    public MaxMinStack(Stack<Integer> max, Stack<Integer> min, Stack<Integer> stack) {
        this.max = max;
        this.min = min;
        this.stack = stack;
    }

    public Integer getMax() {
        return max.peek();
    }

    public Integer getMin() {
        return min.peek();
    }

    public void push(Integer integer) {
        stack.push(integer);

        if (stack.size() == 1) {
            max.push(integer);
            min.push(integer);
            return;
        }

        if (integer > max.peek())
            max.push(integer);
        else
            max.push(max.peek());

        if (integer < min.peek())
            min.push(integer);
        else
            min.push(min.peek());
    }

    public void pop() {
        stack.pop();
        max.pop();
        min.pop();
    }
}
