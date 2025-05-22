package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.annotations;

public class NullCheck {
    public static void checkHumanForNull(Human h) {
        if(h.name == null)
        {
            System.err.println("Name is null");
        }
        if(h.address == null)
        {
            System.err.println("Address is null");
        }
    }

    public static void checkData(Data d)
    {
        if(d.value == null)
        {
            System.err.println("value is null");
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        checkHumanForNull(h);

        Data data = new Data();
        checkData(data);
    }
}
