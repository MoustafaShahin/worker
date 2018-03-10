package com.example.android.worker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;

public class electric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric);
       // main recyle
        final RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        // array store workers data
        final ArrayList<workman> electricworker = new ArrayList<workman>();

//creay
        electricworker.add(new workman("Ali","cairo","elect"));
        electricworker.add(new workman("Mohamed","Alex","elect"));
        electricworker.add(new workman("Sameh","cairo","elect"));
        electricworker.add(new workman("Shady","Mansoura","elect"));
        electricworker.add(new workman("Ali","cairo","elect"));
        electricworker.add(new workman("Mohamed","Alex","elect"));
        electricworker.add(new workman("Sameh","cairo","elect"));
        electricworker.add(new workman("Shady","Mansoura","elect"));
        electricworker.add(new workman("Ali","cairo","elect"));
        electricworker.add(new workman("Mohamed","Alex","elect"));
        electricworker.add(new workman("Sameh","cairo","elect"));
        electricworker.add(new workman("Shady","Mansoura","elect"));
        // setting adapter
        rv.setItemAnimator(new DefaultItemAnimator());
        workerAdapter mAdapter = new workerAdapter(electricworker);
        rv.setAdapter(mAdapter);
        // swiper failed
      //  SwipeController swipeController = new SwipeController();
      //  ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeController);
      //  itemTouchhelper.attachToRecyclerView(rv);
        rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int pos = rv.indexOfChild(v);
            workman send = electricworker.get(pos);
                Intent i = new Intent(electric.this,Profile.class);
                i.putExtra("wor", (Serializable) send);
                startActivity(i);
            }
        });
    }


}
