package com.nadaalshaibnai.androidminiproject.Classes;

public enum TransactionType {
    DEPOSIT {

        public String getColor() {
            return "Green";
        }
    },

    WITHDRAWAL {

        public String getColor() {
            return "Red";
        }



    } };
//