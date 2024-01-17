package com.nadaalshaibnai.androidminiproject.Classes;

import java.io.Serializable;

public class Transaction implements Serializable {

    private int id;
    String date;
    private double amount;
    private static double balance;
    private int account;
    private TransactionType type;

    public Transaction(int id, String date, double amount, double balance, int account, TransactionType type) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.account = account;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public int size() {
        return 0;
    }

 }
