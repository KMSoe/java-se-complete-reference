package com.kaungmyat.javase.chapter_05_control_statements;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr= {1,2,11,21,3,8,6};
        int item = 11;

        /*
        int i=0;
        for ( ; i < arr.length; i++) {
            if(arr[i]== item )
            {
                System.out.println("Found at index "+i);
                break;
            }
            System.out.println("Loop "+i);
        }
        System.out.println("I "+i);
        */
        int i=0;
        boolean found = false;

        while( i < arr.length && !found )
        {
            if(arr[i]== item )
            {
                System.out.println("Found at index "+i);
                found = true;
            }
            i++;
        }

        System.out.println("I "+i);

    }
}
