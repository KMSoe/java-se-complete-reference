package com.kaungmyat.javase.chapter14;

class Stack<T> {
    T[] items;

    public Stack(int size) {
        this.items = (T[]) new Object[size];
    }
}

public class GenericLimitation {
}
