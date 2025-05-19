package com.kaungmyat.javase.chapter_10_exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Dividing 10/0");

        String str = null;

        try {
            int result = 10/2;
            System.out.println("Result: " + result);
            System.out.println("Null: " + str.toLowerCase());
        } catch(ArithmeticException ae) {
            System.out.println("Exception happen there is problem in divisor " + ae.getMessage());
        }
        catch(NullPointerException ne)
        {
            System.out.println("Nullpointer exception");
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally Always run");
        }

        System.out.println("Done");
    }
}
