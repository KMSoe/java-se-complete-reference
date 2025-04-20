package com.kaungmyat.javase.chapter_14_generics;

class Stack<T> {
    T[] items;

    public Stack(int size) {
        this.items = (T[]) new Object[size];
    }
}

public class GenericLimitation {
}
