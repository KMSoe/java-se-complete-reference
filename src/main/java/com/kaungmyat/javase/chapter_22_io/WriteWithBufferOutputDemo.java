package com.kaungmyat.javase.chapter_22_io;

import java.io.*;

public class WriteWithBufferOutputDemo {
    public static void main(String[] args) {
        File file = new File("../../hello.txt");


        try(var bOut = new BufferedOutputStream(new FileOutputStream(file)))
        {
            char ch = 'A';
            for (int i = 0; i < 50; i++) {
                bOut.write(ch);
                ch++;
            }
            bOut.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
