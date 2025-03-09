package com.kaungmyat.javase.chapter_13_io_try_with_resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        File inputFile = new File("./src/main/java/com/kaungmyat/javase/chapter13/ScannerDemo.java");
        File outputFile = new File("./Output.txt");

        System.out.println("File "+inputFile.getAbsolutePath());

        try(var fin = new FileInputStream(inputFile);
            var fout = new FileOutputStream(outputFile))
        {
            int i;
            do
            {
                i = fin.read();
                if( i != -1)//Not EOF
                {
                    System.out.print((char)i);
                    fout.write(i);
                }
            }while (i != -1);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
