package Bt1Reverse;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("The Array after reverse: ");
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.println(reverseArray[i] + " ");
        }
    }
}
