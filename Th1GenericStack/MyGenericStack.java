package Th1GenericStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * MyGenericStack
 */
public class MyGenericStack<T> {

    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return "MyGenericStack [stack=" + stack + "]";
    }
}