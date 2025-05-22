package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.annotations;

public class Human {
    @NotNull(message = "Name should not be null")
    String name;
    String address;
    String biography;
}
