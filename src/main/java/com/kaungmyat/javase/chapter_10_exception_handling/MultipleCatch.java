package com.kaungmyat.javase.chapter_10_exception_handling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {10,20,30};
            System.out.println("Arr [2]: " + arr[2]);

            String str = null;
            System.out.println("toUppercase: " + str.toUpperCase());
        } /*catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Ae "+e.getMessage());
        }catch(NullPointerException ne)
        {
            System.out.println("NullPointer exception");
        }*/
        catch(ArrayIndexOutOfBoundsException | NullPointerException e )
        {
            System.out.println("Something bad happeen ");
            e.printStackTrace();

            //e = new RuntimeException("Sometype");
        }
    }
}
