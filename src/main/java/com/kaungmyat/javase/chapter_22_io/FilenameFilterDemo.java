package com.kaungmyat.javase.chapter_22_io;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.ext);
    }
}

public class FilenameFilterDemo {
    public static void main(String[] args) {
        File directory = new File("src/main/java/com/kaungmyat/javase/chapter_22_io");
        OnlyExt javaOnly = new OnlyExt("java");

        for (File file: directory.listFiles(javaOnly)) {
            System.out.println("File " + file.getAbsolutePath());
        }

        File newDir =  new File("../../another");
        newDir.mkdir();
    }
}
