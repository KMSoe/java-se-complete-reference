package com.kaungmyat.javase.chapter_03_data_types_variables_array;

public class ZeroNaN {
    public static void main(String[] args) {
        int zero = 0;

        float pZero = 0.0f;
        float nZero = -0.0f;
        System.out.println("Zero "+ (zero == pZero));
        System.out.println("Zero "+ (nZero == pZero));

        System.out.println("NZero "+ (1 / nZero));
        System.out.println("PZero "+ (1 / pZero));

        double result = pZero / pZero;
        System.out.println("Result " + result);

        System.out.println("Result " + ( result == result));
        System.out.println("IsNaN " + Double.isNaN(result));
    }
}
