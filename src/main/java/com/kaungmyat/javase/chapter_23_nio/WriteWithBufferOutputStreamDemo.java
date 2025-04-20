package com.kaungmyat.javase.chapter_23_nio;

import java.io.BufferedOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteWithBufferOutputStreamDemo {
    public static void main(String[] args) {
        Path path = Path.of("../../nio3.txt");

        try(BufferedOutputStream bOut = new BufferedOutputStream(Files.newOutputStream(path)))
        {

            for (int i = 0; i < 26; i++) {
                bOut.write((byte)('A'+i));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
