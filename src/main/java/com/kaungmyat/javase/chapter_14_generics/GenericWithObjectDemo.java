package com.kaungmyat.javase.chapter_14_generics;

import java.util.Date;

class BoxObject
{
    Object value;

    BoxObject(Object value)
    {
        this.value = value;
    }
}

public class GenericWithObjectDemo {
    public static void main(String[] args) {
        BoxObject box1 = new BoxObject("Hello");
        BoxObject box2 = new BoxObject(new Date());

        // need to cast
        String str =(String)box1.value;
        System.out.println("str "+str.toLowerCase());

        // String str =(String)box2.value; // => error

    }
}
