package com.example.gits.iak1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BaruActivity extends AppCompatActivity {
    TextView hasil;
    TextView hasil1;
    TextView hasil2;
    TextView hasil3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baru);
        hasil= (TextView)findViewById(R.id.hasil);
        hasil1= (TextView)findViewById(R.id.hasil1);
        hasil2= (TextView)findViewById(R.id.hasil2);
        hasil3= (TextView)findViewById(R.id.hasil3);
        Bundle extra = getIntent().getExtras();
        if (extra!= null){
            String nilaiHasil1 = extra.getString("hasil1");
            String nilaiHasil2 = extra.getString("hasil2");
            String nilaiHasil3 = extra.getString("hasil3");
            String nilaiHasil = extra.getString("hasil");
            hasil1.setText(nilaiHasil1);
            hasil2.setText(nilaiHasil2);
            hasil3.setText(nilaiHasil3);
            hasil.setText(nilaiHasil);
        }
    }
}
