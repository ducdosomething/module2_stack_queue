package Bt1Reverse;

import java.util.Stack;

public class ReverseStringArrayUsingStack {
    public static void main(String[] args) {
        String[] strArray = { "Adam", "Tommy", "David", "Helen" };
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strArray.length; i++) {
            stack.push(strArray[i]);
        }
        String[] reverseStringArray = new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            reverseStringArray[i] = stack.pop();
        }
        System.out.println("The String array after reverse: ");
        for (int i = 0; i < reverseStringArray.length; i++) {
            System.out.println(reverseStringArray[i] + " ");
        }
    }
}
