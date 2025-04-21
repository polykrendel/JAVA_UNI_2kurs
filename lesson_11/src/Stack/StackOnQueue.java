package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private final Queue<Integer> queue1;
    private final Queue<Integer> queue2;

    public StackOnQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        while(queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }

        if(queue1.isEmpty()) {
            return -1;
        }

        return queue1.poll();
    }

    public int top() {
        while(queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        if(queue1.isEmpty()) {
            return -1;
        }

        int top = queue1.peek();
        queue2.add(queue1.poll());

        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }

        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
