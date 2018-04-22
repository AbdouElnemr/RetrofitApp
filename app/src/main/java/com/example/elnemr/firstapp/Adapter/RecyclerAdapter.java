package com.example.elnemr.firstapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.elnemr.firstapp.Model.Contact;
import com.example.elnemr.firstapp.R;

import java.util.List;

/**
 * Created by Elnemr on 4/21/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyviewHolder>{

    List<Contact> contacts;

    public RecyclerAdapter(List<Contact> myContacts){
        this.contacts = myContacts;
    }

    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, int position) {

        holder.Name.setText(contacts.get(position).getName());
        holder.Email.setText(contacts.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView Name , Email;

        public MyviewHolder(View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.name);
            Email = itemView.findViewById(R.id.email);

        }
    }
}
