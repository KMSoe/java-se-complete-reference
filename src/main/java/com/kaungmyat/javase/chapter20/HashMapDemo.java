package com.kaungmyat.javase.chapter20;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2,"Banana");

        System.out.println("Map get " + map.get(1));
        map.put(2, "Orange");
        map.put(3, "Fish");

        System.out.println("Map get 2 " + map.get(2));

        for (String value: map.values()) {
            System.out.println("Values: "+value);
        }

        map.remove(3);

        for (Integer key: map.keySet()) {
            System.out.println("Key " + key);
        }

        for (Map.Entry<Integer, String> keyValues: map.entrySet()) {
            System.out.println("Key "+ keyValues.getKey() + " Value " + keyValues.getValue());
        }
    }
}
