package com.kaungmyat.javase.chapter_17_record_switch;

interface EmployeeTest
{
}
class RegularEmployee implements EmployeeTest
{

}
enum CSuiteEmployee implements EmployeeTest
{
    CEO,CFO,
}

public class SwitchExpDemo {
    public static void main(String[] args) {
        EmployeeTest emp = CSuiteEmployee.CFO;

        if(emp instanceof CSuiteEmployee cse)
        {
            switch(cse)
            {
                case CEO->System.out.println("It is boss");
                case CFO->System.out.println("There is money");
            }
        }
    }
}
