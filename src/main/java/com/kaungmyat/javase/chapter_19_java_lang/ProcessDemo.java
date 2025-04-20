package com.kaungmyat.javase.chapter_19_java_lang;

import java.io.InputStream;

public class ProcessDemo {
    public static void main(String[] args) {
        Process process = null;

        try {
            process = Runtime.getRuntime().exec(new String[]{"ls"});

            try(InputStream in = process.getInputStream())
            {

                int data = in.read();
                while(data != -1)
                {
                    System.out.print((char)data);
                    data = in.read();
                }
            }
            catch(Exception e)
            {
            }
        } catch(Exception e ) {
            e.printStackTrace();
        }
    }
}
