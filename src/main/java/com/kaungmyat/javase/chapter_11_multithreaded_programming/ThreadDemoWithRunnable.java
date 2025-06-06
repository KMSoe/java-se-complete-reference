package com.kaungmyat.javase.chapter_11_multithreaded_programming;

class Printer implements Runnable {
    String name;

    Printer(String name) {

        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread: " + this.name + " i => " + i);
            /*
            try
            {
                 Thread.sleep(100);
            }
            catch(Exception e)
            {
            }
            */
        }
    }
}

public class ThreadDemoWithRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread (new Printer("One"));
        Thread t2 =new Thread(new Printer("Two"));
        Thread t3 =new Thread(new Printer("Three"));

        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

        try
        {
            t1.join();
            System.out.println("T1 done "+t1.isAlive());

            t2.join();
            System.out.println("T2 done");

            t3.join();
            System.out.println("T3 Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Main Thread "+Thread.currentThread().getName());
    }
}
