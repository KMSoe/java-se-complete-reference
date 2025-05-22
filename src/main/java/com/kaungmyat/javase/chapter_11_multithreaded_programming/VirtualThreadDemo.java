package com.kaungmyat.javase.chapter_11_multithreaded_programming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread
{
    String name;
    Task(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread: " + this.name +" i => " + i);
        }
    }
}

public class VirtualThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread th = Thread.ofVirtual().start(new Task("Task 1"));

            try {
                th.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            ExecutorService exs = Executors.newVirtualThreadPerTaskExecutor();
            exs.execute(new Task("Task 2"));
        }
    }
}
