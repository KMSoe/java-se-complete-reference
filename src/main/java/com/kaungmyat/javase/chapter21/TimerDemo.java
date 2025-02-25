package com.kaungmyat.javase.chapter21;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Task run "+new Date());
    }
}

public class TimerDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();

        timer.schedule(task, 5000);

        try {
            Thread.sleep(6000);
        } catch(Exception e) {
            e.printStackTrace();
        }
        task.cancel();
    }
}
