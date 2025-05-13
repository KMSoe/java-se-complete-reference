package com.kaungmyat.javase.chapter_06_intro_to_classes;

public class Stack {
    int top = -1;
    int[] items = new int[10];

    public void push(int item)
    {
        this.items[++this.top] = item;
    }

    public int pop()
    {
        return this.items[this.top--];
    }

    public int size()
    {
        return this.top+1;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(100);

        System.out.println("Pop " + stack1.pop());
        System.out.println("Pop " + stack1.pop());
        System.out.println("Pop " + stack1.pop());

        Stack stack2 = new Stack();
        stack2.push(30);
        stack2.push(50);
        System.out.println("Pop " + stack2.pop());
    }
}
