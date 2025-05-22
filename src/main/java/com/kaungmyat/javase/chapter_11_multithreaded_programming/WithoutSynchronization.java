package com.kaungmyat.javase.chapter_11_multithreaded_programming;

class WithoutSynchronizationCounter {
    int count = 0;

    void increment() {
        count++;
    }
}

class WithoutSynchronizationThread extends Thread {
    WithoutSynchronizationCounter counter;

    WithoutSynchronizationThread (WithoutSynchronizationCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.counter.increment();
        }
    }
}

public class WithoutSynchronization {
    public static void main(String[] args) {
        WithoutSynchronizationCounter counter = new WithoutSynchronizationCounter();

        WithoutSynchronizationThread t1 = new WithoutSynchronizationThread(counter);
        WithoutSynchronizationThread t2 = new WithoutSynchronizationThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();

            System.out.println("Final Count: " + counter.count);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
