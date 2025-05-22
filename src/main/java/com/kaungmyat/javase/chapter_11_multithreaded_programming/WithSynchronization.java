package com.kaungmyat.javase.chapter_11_multithreaded_programming;

class WithSynchronizationCounter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class WithSynchronizationThread extends Thread {
    WithSynchronizationCounter counter;

    WithSynchronizationThread (WithSynchronizationCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.counter.increment();
        }
    }
}

public class WithSynchronization {
    public static void main(String[] args) {
        WithSynchronizationCounter counter = new WithSynchronizationCounter();

        WithSynchronizationThread t1 = new WithSynchronizationThread(counter);
        WithSynchronizationThread t2 = new WithSynchronizationThread(counter);

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
