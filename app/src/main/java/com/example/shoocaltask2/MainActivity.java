package com.example.shoocaltask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout Linlayout = (LinearLayout) findViewById(R.id.Linearlayout1);
        Button AddLanguage = findViewById(R.id.NewLanguageButton);
        AddLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = getLayoutInflater();
                final ConstraintLayout view = (ConstraintLayout) layoutInflater.inflate(R.layout.inflate2,Linlayout,false);
                Linlayout.addView(view);
            }
        });
    }
}
