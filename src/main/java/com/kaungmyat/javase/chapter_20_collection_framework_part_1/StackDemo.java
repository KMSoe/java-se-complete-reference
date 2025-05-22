package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Peek "+stack.peek());

        System.out.println("Size "+stack.size());
        System.out.println("Empty "+stack.isEmpty());
    }
}
