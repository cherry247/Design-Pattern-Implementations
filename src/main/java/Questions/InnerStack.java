package Questions;

import java.util.ArrayList;
import java.util.List;


/* Build a generic Stack class from scratch with push(), pop(), peek(), isEmpty(), and size() methods. 
It should work with any type — Integer, String, etc. 
Throw a meaningful custom exception when you pop from an empty stack. */

class StackUnderFlowException extends RuntimeException {
    public StackUnderFlowException(String message) {
        super(message);
    }
}

class Stack<T> {
    private final List<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (items.isEmpty()) {
            throw new StackUnderFlowException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    public T peek(){
        if(items.isEmpty()){
            throw new StackUnderFlowException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

}

class InnerStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element : " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop : " + stack.peek());
        System.out.println("Stack size : " + stack.size());
    }
    
}
