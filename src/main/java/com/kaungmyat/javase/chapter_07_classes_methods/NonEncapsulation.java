package com.kaungmyat.javase.chapter_07_classes_methods;

class Account
{
    private int balance;

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}

public class NonEncapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(300);
        account.setBalance(-300);
    }
}
