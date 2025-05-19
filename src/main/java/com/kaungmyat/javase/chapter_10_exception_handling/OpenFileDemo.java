package com.kaungmyat.javase.chapter_10_exception_handling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class OpenFileDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/kaungmyat/javase/chapter_10_exception_handling/OpenFileDemo.java");

        try(DataInputStream din = new DataInputStream(new FileInputStream(file)))
        {
        }
        catch(Exception e)
        {
            System.out.println("Ex "+ e.getMessage());
        }
    }
}
