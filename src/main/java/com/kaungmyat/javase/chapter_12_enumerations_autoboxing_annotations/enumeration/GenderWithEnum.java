package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.enumeration;

enum Gender
{
    Male, Female;
}

public class GenderWithEnum {
    public static void main(String[] args) {
        Gender gender = Gender.Male;
        System.out.println("Gender: " + gender);

        gender = Gender.Female;

        if (gender == Gender.Male) {
            System.out.println("Male");
        } else if (gender == Gender.Female) {
            System.out.println("Female");
        }

        for (Gender g: Gender.values()) {
            System.out.println("Gender: "+ g);
        }

        gender = Gender.valueOf("Male");
        System.out.println("Gender "+gender);

        int result =  Gender.Male.compareTo(Gender.Female);
        System.out.println("Result "+result);

        result =  Gender.Male.compareTo(Gender.Male);
        System.out.println("Result "+result);

        result =  Gender.Female.compareTo(Gender.Male);
        System.out.println("Result "+result);
    }
}
