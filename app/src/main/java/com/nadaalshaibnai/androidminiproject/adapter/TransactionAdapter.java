package com.nadaalshaibnai.androidminiproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nadaalshaibnai.androidminiproject.Classes.Transaction;
import com.nadaalshaibnai.androidminiproject.Classes.TransactionType;
import com.nadaalshaibnai.androidminiproject.R;
import com.nadaalshaibnai.androidminiproject.listener.TransactionItemListener;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewholder> {
    private static TransactionItemListener transactionItemListener;
    private static ArrayList<Transaction> transactionList;

    public TransactionAdapter(ArrayList<Transaction> transactionList,
                              TransactionItemListener transactionItemListener) {
        TransactionAdapter.transactionList = transactionList;
        TransactionAdapter.transactionItemListener = transactionItemListener;


    }


    @NonNull
    @Override
    public TransactionAdapter.TransactionViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transactionpage,
                parent,
                false);
        return new TransactionViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.TransactionViewholder holder, int position) {
        Transaction transaction = transactionList.get(position);
        holder.dateTextView.setText(transaction.getDate());
        holder.balanceTextView.setText(String.valueOf(transaction.getBalance()));
        holder.typeTextView.setText(String.valueOf(transaction.getType()));
        holder.amountTextView.setText(String.valueOf(transaction.getAmount()));

    }


    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    static class TransactionViewholder extends RecyclerView.ViewHolder {
        TextView dateTextView;
        TextView balanceTextView;
        TextView typeTextView;
        TextView amountTextView;

        public TransactionViewholder(@NonNull View itemView) {
            super(itemView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            balanceTextView = itemView.findViewById(R.id.balanceTextView);
            typeTextView = itemView.findViewById(R.id.typeTextView);
            amountTextView = itemView.findViewById(R.id.amountTextView);

            itemView.setOnClickListener(v -> {
                TransactionAdapter.transactionItemListener.onTransactionItemClicked(TransactionAdapter.transactionList.get(getAdapterPosition()));
            });

        }


    }


}

