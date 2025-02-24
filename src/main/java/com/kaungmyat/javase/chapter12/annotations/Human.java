package com.kaungmyat.javase.chapter12.annotations;

public class Human {
    @NotNull(message = "Name should not be null")
    String name;
    String address;
    String biography;
}
