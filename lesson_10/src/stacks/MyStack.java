package stacks;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list;

    public MyStack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (!isEmpty()) {
            return list.get(getSize() - 1);
        }
        return null;
    }

    public Object pop() {
        if (!isEmpty()) {
            return list.remove(getSize() - 1);
        }
        return null;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            MyStack cloneStack = (MyStack) super.clone();
            cloneStack.list = new ArrayList<>();
            for (Object o : this.list) {
                cloneStack.list.add(o);
            }
            return cloneStack;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
