package com.kaungmyat.javase.chapter_22_io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("../../data.bin");

        try(var dIn = new DataInputStream(new FileInputStream(file))) {

            int intData = dIn.readInt();
            //int intData = 0;
            double doubleData = dIn.readDouble();
            String str = dIn.readUTF();
            System.out.println("Int Data " + intData + " double " + doubleData + " str " + str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
