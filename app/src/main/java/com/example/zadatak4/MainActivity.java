package com.example.zadatak4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvGimnzija;
    TextView tvOdeljenje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGimnzija=(TextView)findViewById(R.id.textViewGimnazija);
        tvOdeljenje=(TextView)findViewById(R.id.textViewOdeljenje);
    }

    public void onClickGimnazija(View view){
        tvGimnzija.setText("radi");
    }

    public void onClickOdeljenje(View view){
        tvOdeljenje.setText("III5");
    }
}