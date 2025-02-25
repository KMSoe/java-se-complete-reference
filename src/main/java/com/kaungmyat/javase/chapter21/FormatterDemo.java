package com.kaungmyat.javase.chapter21;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Formatter formatter = new Formatter();

        formatter.format("%tr", calendar);
        formatter.format("Fomatting is easy %s Digit %.2f", "Java", 13.4);
        System.out.println("Str " + formatter);
        formatter.close();
    }
}
