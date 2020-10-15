package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    Button Act1;
TextView Perkenalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Perkenalan=findViewById(R.id.perkenalan);
        Act1=findViewById(R.id.BackToAct1);
        Act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Backtoactivity1();
            }
        });
        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
            Perkenalan.setText("Perkenalkan nama saya " + nama);
        }
    public void Backtoactivity1(){
        Intent Act1= new Intent(this, MainActivity.class);
                startActivity(Act1);
    }

    }



