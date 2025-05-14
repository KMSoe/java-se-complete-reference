package com.kaungmyat.javase.chapter_07_classes_methods;

import java.util.ArrayList;

public class VarArgs {
    static int min(String message,int ... values)
    {
        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if(minValue< values[i])
            {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println("Min "+ min("Min ",2,3,6,1));
        System.out.println("Min "+ min("Message",2,3,6,1,19,-2));

        var myStr = "This is a string";

        var list = new ArrayList<String>();
        list.add("Hello");

        System.out.println("List "+list.get(0));
        System.out.println("Size "+list.size());
    }
}
