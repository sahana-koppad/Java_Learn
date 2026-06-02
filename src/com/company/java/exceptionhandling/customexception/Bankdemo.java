package com.company.java.exceptionhandling.customexception;

class BankAccount{
    double balance=5000;
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("insufficient balance");
        }
        balance=balance-amount;
        System.out.println("withdraw successful");
        System.out.println("remainig balance:"+ balance);

    }
}
public class Bankdemo{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

}
