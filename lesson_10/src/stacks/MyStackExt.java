package stacks;

import java.util.ArrayList;

public class MyStackExt extends ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize(){
        return super.size();
    }

    public Object peek(){
        if(!isEmpty()){
            return super.getLast();
        }
        return null;
    }

    public Object pop(){
        if(!isEmpty()){
            return super.removeLast();
        }
        return null;
    }

    public void push(Object o){
        super.add(o);
    }
}
