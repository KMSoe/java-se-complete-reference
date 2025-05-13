package com.kaungmyat.javase.chapter_06_intro_to_classes;

public class Item {
    int data;

    Item(int data)
    {
        System.out.println("Constructor");
        this.data = data;
    }

    @Override
    public String toString() {
        System.out.println("To String called");
        return "Item{" + "data=" + data + '}';
    }

    public static void main(String[] args) {

        Item item1 = new Item(10);
        Item item2 = new Item(20);

        item2 = null;

        System.out.println("Item " + item1);
    }
}
