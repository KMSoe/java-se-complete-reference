package com.kaungmyat.javase.chapter_03_data_types_variables_array;

import java.math.BigDecimal;

public class FloatingPointDemo {
    public static void main(String[] args) {
        // float (2 ^ 32), double (2 ^ 64)

        float f = 2.14F;
        double d = 3.14;

        System.out.println("Float " + f + " Double " + d);

        double a = 0.3F;
        double b = 0.2F;
        double c = a- b;
        System.out.println("A " + a);
        System.out.println("C " + c);

        BigDecimal bdA = new BigDecimal("0.3");
        BigDecimal bdB = new BigDecimal("0.2");
        BigDecimal result = bdA.subtract(bdB);
        System.out.println("Result "+result.toString());

        double e = 2.1E5;
        System.out.println("E "+e);
    }
}
