package com.kaungmyat.javase.chapter_13_io_try_with_resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/kaungmyat/javase/chapter13/ScannerDemo.java");
        System.out.println("File "+file.getAbsolutePath());

        try (FileInputStream fin = new FileInputStream(file)) {
            int i;
            do
            {
                i = fin.read();
                if( i != -1)//Not EOF
                {
                    System.out.print((char)i);
                }
            }while (i != -1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
