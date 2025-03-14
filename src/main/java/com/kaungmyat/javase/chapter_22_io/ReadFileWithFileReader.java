package com.kaungmyat.javase.chapter_22_io;

import java.io.File;
import java.io.FileReader;

public class ReadFileWithFileReader {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/kaungmyat/javase/chapter_22_io/FileDemo.java");

        try (var fr = new FileReader(file)){
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
