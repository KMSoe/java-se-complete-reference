package com.kaungmyat.javase.chapter14;

class NumberBox<T extends Number> {
    T value;

    NumberBox(T value) {
        this.value = value;
    }

    boolean isGreaterThan(NumberBox<?> another) {
        return this.value.longValue() > another.value.longValue();
    }
}

public class WildCardDemo {
    public static void main(String[] args) {
        NumberBox<Double> box1 =new NumberBox<>(10.0);
        NumberBox<Integer> box2 =new NumberBox<>(5);
        NumberBox<Double> box3 =new NumberBox<>(5.0);

        //Long
        System.out.println("box1 > box2: "+box1.isGreaterThan(box2));
        System.out.println("box1 > box3: "+box1.isGreaterThan(box3));
    }
}
