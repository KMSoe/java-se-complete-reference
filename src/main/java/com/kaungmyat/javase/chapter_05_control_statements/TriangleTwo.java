package com.kaungmyat.javase.chapter_05_control_statements;

public class TriangleTwo {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         */

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        /*
         *  space 3, star 1 i=0; j < 3; ; k < 1;
         *** space 2, star 2 i=1; j < 2 ; k < 3;
         ***** space 1, star 3  i=2 ; j <1 ; k  < 4
         ******* space 0, star 4 i=3; j < 0; k < 5

         */
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i*2)+1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
