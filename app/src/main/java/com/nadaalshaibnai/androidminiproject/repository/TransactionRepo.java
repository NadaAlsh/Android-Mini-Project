package com.nadaalshaibnai.androidminiproject.repository;

import com.nadaalshaibnai.androidminiproject.Classes.Transaction;
import com.nadaalshaibnai.androidminiproject.Classes.TransactionType;

import java.util.ArrayList;
import java.util.Random;

public class TransactionRepo {

        private static TransactionRepo instance;

        private TransactionRepo(){}
        public static TransactionRepo getInstance(){
            if(instance == null)
                instance = new TransactionRepo();
            return instance;
        }

        public ArrayList<Transaction> generateDummyTransaction(){
            ArrayList<Transaction> transactionList = new ArrayList<>();
            Random random = new Random();
            for(int i = 0; i < 10; i++){

                int[] id = {123, 456, 789};
                int randomId = random.nextInt(id.length);

                String[] date = {"1/16", "1/14", "1/12"};
                int randomDate = random.nextInt(date.length);

                double[] amount = {50.8, 45.6, 70.0};
                int randomAmount = random.nextInt(amount.length);

                double[] balance = {4000.0, 3965.9, 3895.6};
                int randomBalance = random.nextInt(balance.length);

                int[] account = {123, 456, 789};
                int randomAccount = random.nextInt(account.length);

                TransactionType[] type = {TransactionType.valueOf("DEPOSIT"),
                        TransactionType.valueOf("WITHDRAWAL")};
                int randomType = random.nextInt(type.length);

                transactionList.add(new Transaction(id[randomId],
                        date[randomDate], amount[randomAmount],
                        balance[randomBalance],
                        account[randomAccount],
                        type[randomType]));
            }
            return transactionList;

        }

        public ArrayList<Transaction> dummyData(int numberOfItem){
            ArrayList<Transaction> transactionDetails = new ArrayList<>();


            transactionDetails.add(new Transaction(123, "12-23-2023", 7000, 50000, 1234, TransactionType.WITHDRAWAL));
            transactionDetails.add(new Transaction(123, "1-3-2024", 7000, 50000, 1234, TransactionType.DEPOSIT));
            transactionDetails.add(new Transaction(123, "2-3-2024", 7000, 50000, 1234, TransactionType.WITHDRAWAL));
            transactionDetails.add(new Transaction(123, "5-3-2024", 7000, 50000, 1234, TransactionType.DEPOSIT));
            transactionDetails.add(new Transaction(123, "5-7-2024", 7000, 50000, 1234, TransactionType.WITHDRAWAL));
            transactionDetails.add(new Transaction(123, "10-8-2024", 7000, 50000, 1234, TransactionType.DEPOSIT));

            return transactionDetails;



        }
    }

