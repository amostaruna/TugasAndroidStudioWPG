package com.example.intenttest;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvNama, tvInstitusi;
    private Button Act3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);
        Act3 = findViewById(R.id.btn_activity_3);
        Act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PindahKeACtivity3();
            }
        });
        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama :");
        } else {
            tvNama.setText("Nama :" + nama);
        }

        if (TextUtils.isEmpty(institusi)) {
            tvInstitusi.setText("Institusi : ");
        } else {
            tvInstitusi.setText("Institusi :" + institusi);
        }
    }
    public void PindahKeACtivity3(){
        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra(MainActivity.EXTRA_NAMA, nama);
                startActivity(intent);
    }

}
