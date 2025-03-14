package com.kaungmyat.javase.chapter_17_record_switch;

public class RecordDemo {
    public static void main(String[] args) {
        HumanRecord rec = new HumanRecord("Kaung Myat", 25);
        System.out.println("Name: " + rec.name() + "<<");
        System.out.println("Age: " + rec.age());

        HumanRecord rec2 = new HumanRecord("Kaung Myat ");
        System.out.println("Name:" + rec2.nameInUpperCase() + "<<");
    }
}
