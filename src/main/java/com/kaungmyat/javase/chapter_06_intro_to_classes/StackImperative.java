package com.kaungmyat.javase.chapter_06_intro_to_classes;

public class StackImperative {
    static int push(int[]stack,int top, int item)
    {
        stack[++top] = item;
        return top;
    }
    public static void main(String[] args) {
        int top = -1;
        int stack[] = new int[10];

        top = push(stack,top,10);

        System.out.println("Stack " + stack[0]);
        System.out.println("Top " + top);

        top = push(stack,top,20);
        System.out.println("Stack " + stack[1]);
        System.out.println("Top " + top);

        int top2= -1;
        int stack2[] = new int[10];

        top2 = push(stack2,top,20);
    }
}
