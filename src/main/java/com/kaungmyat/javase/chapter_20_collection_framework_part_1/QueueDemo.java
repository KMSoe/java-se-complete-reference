package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Take "+queue.poll());
        System.out.println("Take "+queue.poll());
        System.out.println("Take "+queue.poll());
    }
}
