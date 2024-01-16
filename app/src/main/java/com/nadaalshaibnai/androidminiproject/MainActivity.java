package com.nadaalshaibnai.androidminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.StrictMode;

import com.nadaalshaibnai.androidminiproject.Classes.Transaction;
import com.nadaalshaibnai.androidminiproject.adapter.TransactionAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView transactionRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy())
//                .detectLeakedClosableObjects()
//                .build());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transactionRecyclerView = findViewById(R.id.transactionRecyclerView);
        transactionRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
        TransactionAdapter transactionAdapter = new TransactionAdapter(transactionList);
        transactionRecyclerView.setAdapter(transactionAdapter);


    }
}