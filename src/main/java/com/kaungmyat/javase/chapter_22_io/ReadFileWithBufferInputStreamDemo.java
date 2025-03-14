package com.kaungmyat.javase.chapter_22_io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFileWithBufferInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/kaungmyat/javase/chapter_22_io/FileDemo.java");

        try (var bin = new BufferedInputStream(new FileInputStream(file))){
            int ch;
            bin.mark(10);

            while ((ch = bin.read()) != -1) {
                System.out.print((char) ch);
            }

            bin.reset();
            byte[] bytes = new byte[10];
            bin.read(bytes);

            String str = new String(bytes);
            System.out.println("Bytes "+str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
