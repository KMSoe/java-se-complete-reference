package com.kaungmyat.javase.chapter12.enumeration;

interface GenderConstants
{
    int MALE = 0;
    int FEMALE = 1;
}

public class WhyEnum {
    public static void main(String[] args) {
        int gender = GenderConstants.MALE;
        gender = GenderConstants.FEMALE;

        System.out.println("Gender: " + gender);
        gender = 100;
    }
}
