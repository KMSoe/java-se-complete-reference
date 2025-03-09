package com.kaungmyat.javase.chapter_15_lambda_expressions;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

interface AccessFn {
    int getItemAt(int index) throws CustomException;
}

public class ExceptionDemo {
    static int getItem(int index) throws CustomException {
        return index;
    }

    public static void main(String[] args) {
        AccessFn fn = ExceptionDemo::getItem;

        try {
            System.out.println("fn " + fn.getItemAt(10));
        } catch (CustomException ex) {
            ex.printStackTrace();
        }
    }
}
