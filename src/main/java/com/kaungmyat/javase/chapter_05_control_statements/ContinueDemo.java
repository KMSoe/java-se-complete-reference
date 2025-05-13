package com.kaungmyat.javase.chapter_05_control_statements;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5)
            {
                //continue;
                //break;
                return;
            }
            System.out.println("i "+i);

        }
        System.out.println("End of loop");
    }
}
