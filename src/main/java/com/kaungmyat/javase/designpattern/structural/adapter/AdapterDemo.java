package com.kaungmyat.javase.designpattern.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Api api = new ObjectAdapter();
        api.api();
    }
}
