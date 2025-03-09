package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 2;
        long lg = 100;
        float f = 12;

//        a = f;
//        lg = f;
        a += f;

        byte b = 12;
        short sh = 129;

        sh = b;
        b = (byte)sh;

        System.out.println("Byte " + b);

        lg = sh;
        lg = a;

        lg = lg + a; //long + int

        b = (byte) (b + 2); //promote to int
        System.out.println("Byte " + b);
    }
}
