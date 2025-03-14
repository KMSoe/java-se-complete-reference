package com.kaungmyat.javase.chapter_22_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../obj.bin");

        Human h;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
        {
            h = (Human) in.readObject();
            System.out.println("H " + h.name + " Age " + h.age + " Address " + h.address);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
