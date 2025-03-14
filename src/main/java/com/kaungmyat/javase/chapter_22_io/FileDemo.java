package com.kaungmyat.javase.chapter_22_io;

import java.io.File;

public class FileDemo {
    static void printDir(String dir) {
        File file = new File(dir);

        if(file.isDirectory()) {
            for(File f : file.listFiles()) {
                printDir(f.getAbsolutePath());
            }
        } else {
            System.out.println(file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        File file = new File("src/main/java/com/kaungmyat/javase/chapter_22_io/FileDemo.java");
        File directory = new File("src/main/java/com/kaungmyat/javase/chapter_22_io");

        System.out.println("isFile: " + file.isFile());
        System.out.println("isDirectory: " + directory.isDirectory());

        System.out.println("File exists: " + file.exists());
        System.out.println("Name " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Parent " + file.getParent());
        System.out.println("File size "+ file.length());

        printDir("src/main/java/com/kaungmyat/javase");



    }
}
