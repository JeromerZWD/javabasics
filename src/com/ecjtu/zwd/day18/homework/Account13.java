package com.ecjtu.zwd.day18.homework;

public class Account13 {
    private  static long id=1;
    private  double balance;
    private  String password;

    public Account13(double balance, String password) {
        this.balance = balance;
        this.password = password;
       id++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
