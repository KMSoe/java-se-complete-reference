package com.kaungmyat.javase.chapter_14_generics;

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class PairDemo {
    static Pair<Integer,String> getSomething() {
        return new Pair(10,"Hello");
    }

    public static void main(String[] args) {
        Pair<Integer, String> data = getSomething();

        System.out.println("Data.first " + data.getFirst());
        System.out.println("Data.second " + data.getSecond());
    }
}
