package com.nadaalshaibnai.androidminiproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nadaalshaibnai.androidminiproject.Classes.Transaction;
import com.nadaalshaibnai.androidminiproject.R;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewholder>{

    ArrayList<Transaction> transactionList;
    public TransactionAdapter(ArrayList<Transaction> transactionList){
        this.transactionList = transactionList;
    }



    @NonNull
    @Override
    public TransactionViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transactionpage,
                parent,
                false);
        return new TransactionViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewholder holder, int position) {
        Transaction transaction = transactionList.get(position);
        holder.balanceTextView.setText(String.valueOf(transaction.getId()));
        holder.dateTextView.setText(transaction.getDate());
        holder.balanceTextView.setText(String.valueOf(transaction.getBalance()));
//        holder.typeTextView.setText(transactionList.getType());
        holder.amountTextView.setText(String.valueOf(transaction.getAmount()));

    }


    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    static class TransactionViewholder extends RecyclerView.ViewHolder{
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
        }

    }
//    public transactiontype(){
//
//}
}
