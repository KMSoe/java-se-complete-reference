package com.kaungmyat.javase.chapter_23_nio;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileByChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/main/java/com/kaungmyat/javase/chapter_22_io/FileDemo.java");

        try (SeekableByteChannel byteChannel = Files.newByteChannel(path)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int count ;
            do
            {
                count = byteChannel.read(buffer);
                if(count != -1)
                {
                    buffer.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char)buffer.get());
                    }
                }
            }while(count!=-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
