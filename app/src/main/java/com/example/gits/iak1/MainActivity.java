package com.example.gits.iak1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView nilai;
    int nilaiAnda = 0;
    TextView hasilAnda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        nilai = (TextView)findViewById(R.id.nilai);
        hasilAnda=(TextView)findViewById(R.id.nilaianda);
    }
    public void plus1(View bv){
        nilaiAnda = nilaiAnda +1;
      //  nilai.setText("Tambah satu");
        nilai.setText(String.valueOf(nilaiAnda));
    }
    public void plus2(View view){
        nilaiAnda = nilaiAnda +2;
//        nilai.setText("Tambah 2");
        nilai.setText(String.valueOf(nilaiAnda));
    }
    public void plus3(View view){
        nilaiAnda = nilaiAnda +3;
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
        nilai.setText(""+nilaiAnda);
        hasilAnda.setText("");

    }

}
