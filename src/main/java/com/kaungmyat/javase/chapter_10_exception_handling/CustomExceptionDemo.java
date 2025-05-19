package com.kaungmyat.javase.chapter_10_exception_handling;

class BusinessLogicException extends Exception {
    public BusinessLogicException(String message)
    {
        super(message);
    }
}

class CreditException extends BusinessLogicException
{
    public CreditException(String message)
    {
        super(message);
    }
}
class DebitException extends BusinessLogicException
{
    public DebitException(String message)
    {
        super(message);
    }
}

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
    void credit(int amount)throws CreditException
    {
        if(amount >0)
        {
            this.balance += amount;
        }
        else
        {
            throw new CreditException("Invalid amount in credit");
        }

    }
    void debit(int amount)throws DebitException
    {
        if(this.balance >= amount && amount>=0)
        {
            this.balance -= amount;
        }
        else
        {
            throw new DebitException("Insuccifient balance");
        }

    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account acc = new Account();

        try {
            acc.credit(100);
            acc.debit(200);
        }
        catch(CreditException ce) {
            System.out.println("Problem with credit");
        } catch(DebitException de) {
            System.out.println("Debit Problem ");
        } catch (BusinessLogicException ex) {
            System.out.println("Exception "+ex.getMessage());
        }

        System.out.println("Acc "+acc);
    }
}
