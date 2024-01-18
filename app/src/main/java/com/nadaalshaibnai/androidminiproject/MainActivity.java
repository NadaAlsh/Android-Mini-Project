package com.nadaalshaibnai.androidminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.Button;

import com.nadaalshaibnai.androidminiproject.Classes.Transaction;
import com.nadaalshaibnai.androidminiproject.adapter.TransactionAdapter;
import com.nadaalshaibnai.androidminiproject.listener.TransactionItemListener;
import com.nadaalshaibnai.androidminiproject.repository.TransactionRepo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TransactionItemListener {
    public static final String ACCOUNT_NAME_KEY = "ACCOUNT_NAME";
    RecyclerView transactionRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transactionRecyclerView = findViewById(R.id.transactionRecyclerView);

        transactionRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TransactionAdapter transactionAdapter = new TransactionAdapter(
                TransactionRepo.getInstance().generateDummyTransaction(),
                this
        );
        transactionRecyclerView.setAdapter(transactionAdapter);
    }
    @Override
    public void onTransactionItemClicked(Transaction transaction) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(ACCOUNT_NAME_KEY, transaction);
        startActivity(intent);
    }
}