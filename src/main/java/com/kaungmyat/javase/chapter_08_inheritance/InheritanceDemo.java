package com.kaungmyat.javase.chapter_08_inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Human h = new Doctor("Dr Someone",30,"OG");
        //h.eat();
        h.work();

        h = new Teacher("Daw Hla",50,"Math");
        //h.eat();
        h.work();

        h = new Human("Oridinary One",40);
        //h.eat();
        h.work();
    }
}
