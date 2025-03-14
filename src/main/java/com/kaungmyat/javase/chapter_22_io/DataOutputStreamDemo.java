package com.kaungmyat.javase.chapter_22_io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../data.bin");
        try(var dOut = new DataOutputStream(new FileOutputStream(file))) {

            dOut.writeInt(10);
            dOut.writeDouble(20.0);
            dOut.writeUTF("Hello World");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
