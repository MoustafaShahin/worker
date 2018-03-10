package com.example.android.worker;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Moustafa on 3/9/2018.
 */

public class workerAdapter extends RecyclerView.Adapter<workerAdapter.workerViewholder>{
   private ArrayList<workman> workers = new ArrayList<workman>();
    public static class workerViewholder extends RecyclerView.ViewHolder {
       public CardView cv;
        public TextView personName;
        public TextView personcity;
        public TextView personprof;
        public ImageView personPhoto;

        public workerViewholder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personcity = (TextView)itemView.findViewById(R.id.person_city);
            personprof = (TextView)itemView.findViewById(R.id.person_prof);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }
    public workerAdapter(ArrayList<workman> s){
        workers = s;
    }
    public workerViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new workerViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(workerViewholder holder, int position) {
        workman wor = workers.get(position);
        holder.personName.setText(wor.getName());
        holder.personcity.setText(wor.getCity());
        holder.personprof.setText(wor.getProf());

    }
    public int getItemCount() {
        return workers.size();
    }
}