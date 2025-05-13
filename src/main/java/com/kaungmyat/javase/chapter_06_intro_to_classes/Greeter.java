package com.kaungmyat.javase.chapter_06_intro_to_classes;

public class Greeter {
    void greet(String name)
    {
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {

        Greeter g = new Greeter();

        g.greet("Aung Aung");
        g.greet("Mg Hla");
    }
}
