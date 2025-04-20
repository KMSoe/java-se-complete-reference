package com.kaungmyat.javase.chapter_23_nio;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileInputStreamDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/main/java/com/kaungmyat/javase/chapter_22_io/FileDemo.java");

        try( InputStream fin = Files.newInputStream(path))
        {
            int data ;
            do
            {
                data = fin.read();
                if(data != -1)
                {
                    System.out.print((char)data);
                }
            }while(data != -1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
