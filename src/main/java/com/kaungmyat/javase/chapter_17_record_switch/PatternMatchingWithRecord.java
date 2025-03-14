package com.kaungmyat.javase.chapter_17_record_switch;

record Employee(String name, Id id){};
record Id(int idNum, Type type) {
    enum Type {
        FullTime,PartTime
    }
}

public class PatternMatchingWithRecord {
    public static void main(String[] args) {
        Object emp= new Employee("Kaung Myat",new Id(1, Id.Type.FullTime));

        if( emp instanceof Employee employee)
        {
            System.out.println("Name " + employee.name());
            System.out.println("Id " + employee.id().idNum());
            System.out.println("Type " + employee.id().type());
        }
    }
}
