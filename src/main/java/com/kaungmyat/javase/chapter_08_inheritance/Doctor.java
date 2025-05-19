package com.kaungmyat.javase.chapter_08_inheritance;

public class Doctor extends Human {
    String speciality;
    Doctor(String name,int age,String speciality)
    {
        super(name,age);
        this.speciality = speciality;
    }
    /*
    public void eat()
    {
        System.out.println("Doctor eat");
    }*/
    @Override
    public void work()
    {
        System.out.println("Dr "+this.name +" treat his patient ");
    }
}
