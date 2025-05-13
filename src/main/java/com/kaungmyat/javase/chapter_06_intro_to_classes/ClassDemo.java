package com.kaungmyat.javase.chapter_06_intro_to_classes;

class Account
{
    private int balance ;

    Account()//default constructor
    {

    }

    Account(int balance)//parameterized constructor
    {
        System.out.println("Constructor "+balance);
        this.balance= balance;
    }
    void credit(int amount)
    {
        if(amount >0)
        {
            this.balance += amount;
        }

    }
    void debit(int amount)
    {
        if(this.balance >= amount && amount>=0)
        {
            this.balance -= amount;
        }

    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }

}

public class ClassDemo {
    public static void main(String[] args) {
        Account acc1 = new Account(300);
        Account acc2 = new Account(10);

        Account acc3 =new Account();//default

        acc1.credit(100);
        acc1.debit(50);

        acc2.credit(40);

        System.out.println("Acc1 "+acc1);
        System.out.println("Acc2 "+acc2);
    }
}
