package com.example.gits.iak1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView nilai;
    int nilaiAnda = 0;
    int hasil1 = 0;
    int hasil2 = 0;
    int hasil3 = 0;
    int pref;
    TextView hasilAnda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        nilai = (TextView)findViewById(R.id.nilai);
        hasilAnda=(TextView)findViewById(R.id.nilaianda);
        if (PrefHelper.getNilaiBol(getApplicationContext())){

        }else{

        }
        int hasilpref = PrefHelper.getNilaiHasil(getApplicationContext());
        nilai.setText(String.valueOf(hasilpref));
    }

    public void plus1(View bv){
        pref=PrefHelper.getNilaiHasil(getApplicationContext());
        nilaiAnda = pref +1;
        hasil1 = hasil1+1;
        PrefHelper.saveNilaiHasil(getApplicationContext(),nilaiAnda);
      //  nilai.setText("Tambah satu");
        nilai.setText(String.valueOf(nilaiAnda));
    }
    public void plus2(View view){
        pref=PrefHelper.getNilaiHasil(getApplicationContext());
        nilaiAnda = pref +2;
        hasil2 = hasil2+1;
        PrefHelper.saveNilaiHasil(getApplicationContext(),nilaiAnda);
//       nilai.setText("Tambah 2");
        nilai.setText(String.valueOf(nilaiAnda));
    }
    public void plus3(View view){
        pref=PrefHelper.getNilaiHasil(getApplicationContext());

        nilaiAnda = pref +3;
        hasil3= hasil3+1;
        PrefHelper.saveNilaiHasil(getApplicationContext(),nilaiAnda);

//        nilai.setText("Tambah 3");
        nilai.setText(String.valueOf(nilaiAnda));

    }
    public void hasil(View view){
        if (nilaiAnda<2){
            hasilAnda.setText("horeeee");
        }else{
            hasilAnda.setText("Nilai Anda Adalah "+ nilaiAnda);
        }
    }
    public void reset(View v){
        nilaiAnda = 0;
        PrefHelper.saveNilaiHasil(getApplicationContext(),nilaiAnda);

        nilai.setText(""+nilaiAnda);
        hasilAnda.setText("");
    }
    public void total(View v){
        Intent intent = new Intent(MainActivity.this, BaruActivity.class);
        intent.putExtra("hasil1",""+hasil1);
        intent.putExtra("hasil2",""+hasil2);
        intent.putExtra("hasil3",""+hasil3);
        intent.putExtra("hasil",""+nilaiAnda);
        startActivity(intent);
    }
}
