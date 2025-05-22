package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Human implements Comparable<Human> {
    String name;
    int age;

    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Human another) {
        if(this.age - another.age == 0) {
            return this.name.compareTo(another.name);
        } else {
            return this.age - another.age;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

public class CustomList {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human("Aung Aung",30));
        list.add(new Human("Hla Hla",18));
        list.add(new Human("Aung Hla",18));
        list.add(new Human("Naing Aung ",35));

        Collections.sort(list);
//        Collections.reverse(list);

        for(Human h : list)
        {
            System.out.println("h "+h);
        }
    }
}
