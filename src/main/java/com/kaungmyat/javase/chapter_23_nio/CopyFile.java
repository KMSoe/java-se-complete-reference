package com.kaungmyat.javase.chapter_23_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        try {
            Path source = Path.of("../../nio2.txt");
            Path target = Path.of("../../nio2_copy.txt");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
