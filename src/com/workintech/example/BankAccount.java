package com.workintech.example;

public class BankAccount {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String password;

    public BankAccount(long accountNumber, double accountBalance, String customerName, String email, String password){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
    }

    public long getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance<0?0:accountBalance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public void withdraw(double amount){
        if(this.accountBalance - amount < 0){
            System.out.println("Cannot withdraw the given amount");
        } else {
            this.accountBalance = this.accountBalance - amount;
        }
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("There is not any money to deposit");
        } else {
            this.accountBalance = this.accountBalance + amount;
        }
    }
}
