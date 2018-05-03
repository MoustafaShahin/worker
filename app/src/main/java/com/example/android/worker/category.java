package com.example.android.worker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.github.clans.fab.FloatingActionButton;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ImageButton elecb = (ImageButton)findViewById(R.id.elect);

        elecb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(category.this,electric.class);
                startActivity(i);
                FloatingActionButton item1 = (FloatingActionButton)findViewById(R.id.menu_item);
                item1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(category.this,Profile.class);
                        startActivity(i);
                    }
                });
            }
        });
    }
}
