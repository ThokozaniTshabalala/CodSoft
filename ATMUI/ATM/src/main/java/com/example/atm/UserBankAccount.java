package com.example.atm;public class UserBankAccount {


    private double balance=1000.0;

    public void setBalance(double bal){
        this.balance=bal;
    }

    public double getDoubleBalance(){
        return balance;
    }

    public String getBalance(){
        String availableBalance= String.valueOf(balance);
        return availableBalance;
    }

    public void increaseBalance(double amount){
        balance=balance+amount;
    }

    public void decreaseBalance(double amount){
        balance=balance-amount;
    }

    public Boolean withDrawApproved(double amount){
        double difference=balance-amount;

        if(difference>=0){
            return true;
        }
        else{
            return false;
        }
    }

}
