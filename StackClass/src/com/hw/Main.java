package com.hw;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);

        System.out.println(stack.peek());
        stack.pop();

        System.out.println("");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
