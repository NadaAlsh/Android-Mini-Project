package com.nadaalshaibnai.androidminiproject;

//import static com.nadaalshaibnai.androidminiproject.adapter.TransactionAdapter.transactionList;

import static com.nadaalshaibnai.androidminiproject.MainActivity.ACCOUNT_NAME_KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nadaalshaibnai.androidminiproject.Classes.Transaction;
import com.nadaalshaibnai.androidminiproject.listener.TransactionItemListener;

public class DetailsActivity extends AppCompatActivity {
    private static final String TAG = "TRANSACTION_TYPE";
//    private static TransactionItemListener transactionItemListener;
    private TextView transactionID;
    private TextView transactionType;
    private TextView transactionDate;
    private TextView amount;
    private TextView currentBalance;
    private TextView accountNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Log.i(TAG, "onCreate: ");

        transactionID = findViewById(R.id.transactionID);
        transactionType = findViewById(R.id.transactionType);
        transactionDate = findViewById(R.id.transactionDate);
        amount = findViewById(R.id.amount);
        currentBalance = findViewById(R.id.currentBalance);
        accountNumber = findViewById(R.id.accountNumber);

        Transaction transactionMine = getIntent().getSerializableExtra(ACCOUNT_NAME_KEY, Transaction.class );

        transactionID.setText("Transaction Number: " + String.valueOf(transactionMine.getId()));
        transactionType.setText("Transaction Type: " + String.valueOf(transactionMine.getType()));
        amount.setText("Amount: " + String.valueOf(transactionMine.getAmount()));
        currentBalance.setText("Balance: " + String.valueOf(transactionMine.getBalance()));
        accountNumber.setText("Account: " + String.valueOf(transactionMine.getAccount()));
        transactionDate.setText("Date: " + String.valueOf(transactionMine.getDate()));
    }
}