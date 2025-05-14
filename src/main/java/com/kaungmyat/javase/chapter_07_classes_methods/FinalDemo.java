package com.kaungmyat.javase.chapter_07_classes_methods;

class Data
{
    final int MAX_SIZE = 100;
}

public class FinalDemo {
    public static void main(String[] args) {
        final int DATA = 10;
        //data ++;
        Data data= new Data();
        //data.MAX_SIZE ++;
    }
}
