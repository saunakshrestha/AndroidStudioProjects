package com.saunakshrestha.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContact;
    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContact){
        this.context=context;
        this.arrContact=arrContact;
    }






    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //viewHolder creating or inflating from contact_row.xml to this view
        View v= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);

        ViewHolder vHolder = new ViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContact.get(position).image);
        holder.txtName.setText(arrContact.get(position).contactName);
        holder.txtNumber.setText(arrContact.get(position).contactNo);
    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtNumber;
        ImageView imgContact;
        public ViewHolder(@NonNull View itmView) {
            super(itmView);

            txtName = itmView.findViewById(R.id.txtName);
            txtNumber = itmView.findViewById(R.id.txtNumber);
            imgContact = itmView.findViewById(R.id.imgContact);
        }
    }
}
