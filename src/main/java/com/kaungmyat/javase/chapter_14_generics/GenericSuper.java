package com.kaungmyat.javase.chapter_14_generics;

class GenParent<T> {
    T value;

    GenParent(T value) {
        this.value = value;
    }

    T getValue()
    {
        return this.value;
    }
}

class GenChild<T>  extends GenParent<T> {
    GenChild(T value) {
        super(value);
    }
}

public class GenericSuper {
    public static void main(String[] args) {
        GenChild<String> child = new GenChild("Hello");
        System.out.println("Child "+ child.value.toLowerCase());

        GenChild<Integer> child2 = new GenChild(2);
        System.out.println("child instanceof GenChild<String> "+( child instanceof GenChild<String>));
        System.out.println("child instanceof GenChild<?> "+( child instanceof GenChild<?>));
        System.out.println("child2 instanceof GenChild<?> "+( child2 instanceof GenChild<?>));

        //GenChild<Object> child3 =(GenChild<Object>)(child2);
        //System.out.println("Child3 "+child3.value);
    }
}
