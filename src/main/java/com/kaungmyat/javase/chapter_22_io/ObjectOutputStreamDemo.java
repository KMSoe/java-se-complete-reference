package com.kaungmyat.javase.chapter_22_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../obj.bin");

        Human h = new Human("Somone",13,"YGN");

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file)))
        {
            out.writeObject(h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
