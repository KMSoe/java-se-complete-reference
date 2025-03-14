package com.kaungmyat.javase.chapter_17_record_switch;

record Item (String name, float price, int quantity) {
    float total() {
        return this.price * this.quantity;
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Item item = new Item("Apple",10,2);
        System.out.println("Total: " + item.total());
    }
}
